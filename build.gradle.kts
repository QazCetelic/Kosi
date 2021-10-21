import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
}

group = "me.qaz"
version = "0.1.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files(
        "$projectDir/../../Kotlin/Neatlin/build/libs/Neatlin-jvm-0.3.3.jar"
    ))
    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}