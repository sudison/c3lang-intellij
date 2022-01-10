package org.c3lang.intellijplugin.utils

import org.jdom.Element

fun Element.writeString(name: String, value: String) {
    val opt = Element("option")
    opt.setAttribute("name", name)
    opt.setAttribute("value", value)
    addContent(opt)
}

fun Element.readString(name: String): String? {
    return children
        .find { it.name == "option" && it.getAttributeValue("name") == name }
        ?.getAttributeValue("value")
}