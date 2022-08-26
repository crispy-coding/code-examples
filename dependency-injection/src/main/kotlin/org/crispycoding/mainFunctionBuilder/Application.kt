package org.crispycoding.mainFunctionBuilder

fun main() {
    println("This is the mainFunctionBuilder setup.")
    val textPrinter = TextPrinter(SimpleTextProvider())
    textPrinter.printInitialText()
}