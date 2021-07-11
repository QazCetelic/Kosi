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
    implementation(files("/home/qaz/Projects/Programming/Neatlin/build/libs/Neatlin-jvm-0.2.2.jar"))
    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}