package org.crispycoding.springIoc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main() {
    println("This is the springIoc setup.")
    SpringApplication.run(Application::class.java)
}

@SpringBootApplication
open class Application
