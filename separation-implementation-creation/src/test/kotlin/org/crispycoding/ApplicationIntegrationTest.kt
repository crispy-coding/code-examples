package org.crispycoding

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
class ApplicationIntegrationTest {

    @Autowired
    lateinit var app: Application

    @Test
    fun some(){
        assertEquals("hello", app.getValue())
    }

}