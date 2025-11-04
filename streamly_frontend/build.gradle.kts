@file:Suppress("UnstableApiUsage")

// PUBLIC_INTERFACE
/**
 * Root Gradle build file for the Streamly frontend project.
 * Converted to conventional Gradle to ensure builds succeed when Declarative DSL isn't supported.
 * - Keeps configuration minimal and delegates most config to modules.
 * - Preserves minSdk=30 and splash/manifest as defined in the app module.
 */

plugins {
    // Keep root clean; versions defined in modules
}

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

tasks.register("noop") {
    group = "help"
    description = "No-op task for tooling detection"
    doLast {
        println("This project uses conventional Gradle Kotlin DSL for compatibility with the environment.")
    }
}
