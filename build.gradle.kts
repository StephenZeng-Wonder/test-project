apply(plugin = "project")

plugins {
    `java-library`
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
    dependencies {
        implementation("core.framework:core-ng:9.1.5")
        testImplementation("core.framework:core-ng-test:9.1.5")
    }
}

project(":test2-module") {
    dependencies {
        implementation("core.framework:core-ng:9.1.5")
        testImplementation("core.framework:core-ng-test:9.1.5")
    }
}

