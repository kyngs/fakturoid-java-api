plugins {
    id("xyz.kyngs.fakturoid.library-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":common"))
    api("com.squareup.okhttp3:okhttp:4.12.0")
}