androidApplication {
    namespace = "org.example.app"

    testing {
        unitTests {
            // Do not fail CI when no tests are discovered in app module
            failOnNoDiscoveredTests = false
        }
    }

    dependencies {
        implementation("org.apache.commons:commons-text:1.11.0")
        implementation(project(":utilities"))
    }
}
