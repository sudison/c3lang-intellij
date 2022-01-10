package org.c3lang.intellijplugin.runner

import com.intellij.execution.Executor
import com.intellij.execution.configurations.*
import com.intellij.execution.filters.Filter
import com.intellij.execution.filters.OpenFileHyperlinkInfo
import com.intellij.execution.process.AnsiEscapeDecoder
import com.intellij.execution.process.KillableProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.Disposable
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.TextComponentAccessor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.util.Key
import com.intellij.ui.DocumentAdapter
import com.intellij.ui.EditorTextField
import com.intellij.ui.components.Label
import com.intellij.ui.layout.CCFlags
import com.intellij.ui.layout.panel
import org.c3lang.intellijplugin.utils.readString
import org.c3lang.intellijplugin.utils.writeString
import org.jdom.Element
import javax.swing.Icon
import javax.swing.JComponent
import javax.swing.event.DocumentEvent
import kotlin.math.max

class C3RunnerConfigType : ConfigurationTypeBase(
    "C3RunnerConfiguration",
    "C3",
    "C3 command run configuration",
    null as Icon?
) {
    init {
        addFactory(C3ConfigurationFactory(this))
    }
}

class C3ProcessHandler(
    commandLine: GeneralCommandLine
) : KillableProcessHandler(commandLine), AnsiEscapeDecoder.ColoredTextAcceptor {
    override fun coloredTextAvailable(text: String, attributes: Key<*>) {
        super.notifyTextAvailable(text, attributes)
    }

}

open class C3CompilerOutputFilter(
    private val environment: ExecutionEnvironment
) : Filter, DumbAware {
    private val lineRegx = "\\((.*.c3):(\\d*)\\).*\n".toRegex()
    override fun applyFilter(line: String, entireLength: Int): Filter.Result? {
        val matchResult = lineRegx.matchEntire(line) ?: return null
        val filePath = matchResult.groups[1]!!.value
        val lineNumber = max(0, matchResult.groups[2]!!.value.toInt() - 1)

        val file = environment.project.baseDir?.findFileByRelativePath(filePath) ?: return null
        val link = OpenFileHyperlinkInfo(environment.project, file, lineNumber)
        val lineStart = entireLength - line.length

        val end = matchResult.groups[1]!!.range.last
        return Filter.Result(
            lineStart + matchResult.groups[1]!!.range.first,
            lineStart + end + 1,
            link,
            false
        )
    }

}

class C3RunState(
    environment: ExecutionEnvironment,
    private val config: C3CommandConfiguration
) : CommandLineState(environment) {

    init {
        addConsoleFilters(C3CompilerOutputFilter(environment))
    }

    override fun startProcess(): ProcessHandler {
        val cmds = mutableListOf(config.command)
        cmds.addAll(config.args.split(" "))
        val cmdLine =
            GeneralCommandLine(cmds).withWorkDirectory(environment.project.basePath)

        val handler = C3ProcessHandler(cmdLine)
        ProcessTerminatedListener.attach(handler)
        return handler
    }

}

fun pathTextField(
    fileChooserDescriptor: FileChooserDescriptor,
    disposable: Disposable,
    title: String,
    onTextChanged: () -> Unit = {}
): TextFieldWithBrowseButton {

    val component = TextFieldWithBrowseButton(null, disposable)
    component.addBrowseFolderListener(
        title, null, null,
        fileChooserDescriptor,
        TextComponentAccessor.TEXT_FIELD_WHOLE_TEXT
    )
    component.childComponent.document.addDocumentListener(object : DocumentAdapter() {
        override fun textChanged(e: DocumentEvent) {
            onTextChanged()
        }
    })

    return component
}

class C3RunnerConfigurationEditor(
    val project: Project,
) : SettingsEditor<C3CommandConfiguration>() {

    private val command: TextFieldWithBrowseButton =
        pathTextField(FileChooserDescriptorFactory.createSingleFileDescriptor(), this, "Path of C3 compiler")
            .apply { isEnabled = true }

    private val args = EditorTextField("")
    override fun resetEditorFrom(s: C3CommandConfiguration) {
        command.text = s.command
        args.text = s.args
    }

    override fun applyEditorTo(s: C3CommandConfiguration) {
        s.command = command.text
        s.args = args.text
    }

    override fun createEditor(): JComponent = panel {
        val label = Label("&C3:")
        label.labelFor = command
        row(label) {
            command(CCFlags.pushX, CCFlags.growX)
        }

        val label2 = Label("&Args:")
        label.labelFor = args
        row(label2) {
            args(CCFlags.pushX, CCFlags.growX)
        }
    }
}

class C3CommandConfiguration(
    project: Project,
    name: String,
    factory: ConfigurationFactory
) : LocatableConfigurationBase<RunProfileState>(project, factory, name),
    RunConfigurationWithSuppressedDefaultDebugAction {
    var command: String = ""
    var args: String = ""
    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState? {
        return C3RunState(environment, this)
    }

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return C3RunnerConfigurationEditor(project)
    }

    override fun writeExternal(element: Element) {
        super.writeExternal(element)
        element.writeString("command", command)
        element.writeString("args", args)
    }

    override fun readExternal(element: Element) {
        super.readExternal(element)
        command = element.readString("command") ?: ""
        args = element.readString("args") ?: ""
    }
}

class C3ConfigurationFactory(type: C3RunnerConfigType) : ConfigurationFactory(type) {

    override fun getId(): String = ID

    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return C3CommandConfiguration(project, "C3", this)
    }

    companion object {
        const val ID: String = "C3 Command"
    }
}