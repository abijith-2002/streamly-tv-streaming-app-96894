package org.example.app

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

/**
 * PUBLIC_INTERFACE
 * NoopUnitTest ensures at least one test is discovered so Gradle's test task
 * does not fail due to zero-discovery in environments where the declarative DSL
 * cannot disable failOnNoDiscoveredTests.
 */
class NoopUnitTest {

    @Test
    fun testNoop() {
        // Simple assertion to be always true
        assertTrue(true)
    }
}
