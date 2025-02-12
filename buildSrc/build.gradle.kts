plugins {
    `kotlin-dsl`
    kotlin("plugin.serialization") version "1.9.20"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
}

kotlin {
    sourceSets.main {
        kotlin.srcDirs("src/main/kotlin")
    }
}