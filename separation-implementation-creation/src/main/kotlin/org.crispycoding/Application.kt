package org.crispycoding

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

fun main(args : Array<String>) {
    SpringApplication.run(Application::class.java)
}

@SpringBootApplication
open class Application(private val textProvider: TextProvider) {

    fun getValue(): String {
        return textProvider.getText()
    }

    @PostConstruct
    fun printText() {
        println(getValue())
    }

}
