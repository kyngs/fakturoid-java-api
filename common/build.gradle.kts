plugins {
    id("xyz.kyngs.fakturoid.library-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    api("org.jetbrains:annotations:24.1.0")
    api("com.fasterxml.jackson.core:jackson-databind:2.16.2")
}