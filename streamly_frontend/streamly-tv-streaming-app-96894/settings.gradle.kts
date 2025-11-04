// PUBLIC_INTERFACE
/**
 * Repository root settings for tooling compatibility. We delegate to the actual Android project
 * located under streamly_frontend/ using composite build includeBuild.
 */
rootProject.name = "streamly-repo-root"

// Allow running gradle from repository root by including the Android project as a composite
includeBuild("streamly_frontend")
