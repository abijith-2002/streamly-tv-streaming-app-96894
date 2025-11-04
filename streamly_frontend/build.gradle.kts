// PUBLIC_INTERFACE
/**
 * Minimal Gradle build file created to help tools detect the Gradle project root.
 * The real configuration uses Declarative Gradle (.dcl files).
 * This file intentionally keeps configuration minimal and does not change behavior.
 */

plugins {
    // No plugins here to avoid interfering with the declarative setup.
}

tasks.register("noop") {
    group = "help"
    description = "No-op task for tooling detection"
    doLast {
        println("This project uses Declarative Gradle (.dcl). See settings.gradle.dcl.")
    }
}
