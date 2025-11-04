// PUBLIC_INTERFACE
/**
 * Root aggregator for the repository workspace. Some tooling expects a build file at this level.
 * Delegates actual Android project to streamly_frontend/.
 */
tasks.register("noopRoot") {
    group = "help"
    description = "No-op root task; Android project is in streamly_frontend/"
    doLast {
        println("Android project is located in streamly_frontend/. Use that directory as Gradle root.")
    }
}
