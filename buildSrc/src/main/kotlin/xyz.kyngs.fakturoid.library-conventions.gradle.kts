plugins {
    `java-library`
    `maven-publish`
}

version = "3.0.0-SNAPSHOT"
group = "xyz.kyngs.fakturoid"


java {
    sourceCompatibility = JavaVersion.VERSION_17
    withSourcesJar()
    withJavadocJar()
}

publishing {
    repositories {
        maven {
            name = "kyngsRepo"
            url = uri(
                "https://repo.kyngs.xyz/" + (if (project.version.toString()
                        .contains("SNAPSHOT")
                ) "snapshots" else "releases") + "/"
            )
            credentials(PasswordCredentials::class)
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}