apply(plugin = "project")

plugins {
    `java-library`
    kotlin("jvm") version "1.9.20"
}

repositories {
    mavenCentral()
}

subprojects {
    group = "org.example"
    version = "1.0.0"

    repositories {
        maven {
            url = uri("https://neowu.github.io/maven-repo/")
            content {
                includeGroupByRegex("core\\.framework.*")
            }
        }
    }

    if (!plugins.hasPlugin("java")) {
        return@subprojects
    }
}

project(":test1-module") {
    apply(plugin = "kotlin")
    dependencies {
        implementation("core.framework:core-ng:9.1.5")
        testImplementation("core.framework:core-ng-test:9.1.5")
    }
}
