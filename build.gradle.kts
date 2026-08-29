plugins {
    kotlin("jvm") version "1.9.10"
    application
    id("io.gitlab.arturbosch.detekt") version "1.23.3"
}

group = "mate.academy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

// Force a Kotlin JVM target that the Kotlin plugin version understands.
// Kotlin 1.8.x does not recognize JVM target "21", so set a supported target explicitly.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    // Use JVM target 17 which is supported by this Kotlin plugin.
    kotlinOptions.jvmTarget = "17"
}

// Configure Java compilation to target Java 17 as well so Kotlin and Java targets match.
tasks.withType<JavaCompile>().configureEach {
    sourceCompatibility = "17"
    targetCompatibility = "17"
    options.release.set(17)
}

// Use the JDK that Gradle is running with (no explicit toolchain requested).

detekt {
    buildUponDefaultConfig = true // preconfigure defaults
    allRules = false // activate all available (even unstable) rules.
    baseline = file("$projectDir/config/baseline.xml") // a way of suppressing issues before introducing detekt
}