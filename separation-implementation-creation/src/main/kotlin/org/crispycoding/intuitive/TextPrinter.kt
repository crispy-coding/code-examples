package org.crispycoding.intuitive

class TextPrinter {

    private val simpleTextProvider = SimpleTextProvider()

    fun printInitialText() {
        println("Printing text: " + simpleTextProvider.getText())
    }

}