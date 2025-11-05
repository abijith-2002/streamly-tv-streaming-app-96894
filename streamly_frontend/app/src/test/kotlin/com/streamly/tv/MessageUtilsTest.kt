package com.streamly.tv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MessageUtilsTest {
    @Test
    fun testGetMessage() {
        // Expect the exact spacing returned by MessageUtils.message()
        assertEquals("Hello     World!", MessageUtils.message())
    }
}
