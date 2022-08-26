package org.crispycoding.springIoc

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class TextPrinter(private val textProvider: SimpleTextProvider) {

    @PostConstruct
    fun printInitialText() {
        println("Printing text: " + textProvider.getText())
    }

}