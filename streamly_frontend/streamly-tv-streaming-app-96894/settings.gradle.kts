pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// Root settings (Kotlin DSL variant) to help analyzers that specifically look for .kts and an included Android app.
rootProject.name = "streamly-root-kts"

// Include the nested project via composite build to route Gradle invocations that start at repository root.
includeBuild("streamly_frontend")
