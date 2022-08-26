package org.crispycoding.mainFunctionBuilder

class TextPrinter(private val simpleTextProvider: SimpleTextProvider) {

    fun printInitialText() {
        println("Printing text: " + simpleTextProvider.getText())
    }

}