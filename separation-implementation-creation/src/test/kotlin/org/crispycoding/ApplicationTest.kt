package org.crispycoding

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations.openMocks
import kotlin.test.assertEquals

internal class ApplicationTest {

    @Test
    fun someTest() {
        val app = Application(TextProvider())
        assertEquals("hello", app.getValue())
    }

    @Test
    fun someTest2() {
        val mockTextProvider = mock(TextProvider::class.java)
        `when`(mockTextProvider.getText()).thenReturn("world")
        val app = Application(mockTextProvider)
        assertEquals("world", app.getValue())
    }

    @BeforeEach
    fun init() {
        openMocks(this)
    }

    @Mock
    lateinit var mockTextProvider: TextProvider

    @InjectMocks
    lateinit var app: Application

    @Test
    fun someTest3() {
        `when`(mockTextProvider.getText()).thenReturn("world")

        assertEquals("world", app.getValue())
        verify(mockTextProvider).getText()
    }

}