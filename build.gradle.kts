plugins {
    kotlin("jvm") version "2.0.21"
    id("java-library")
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "java-library")

    group = "arc.storm"
    version = "1.0"

    repositories {
        mavenCentral()
        mavenLocal()
    }

    kotlin {
        jvmToolchain(21)
    }

    dependencies {
        testImplementation(rootProject.libs.junit.jupiter.api)
        testImplementation(rootProject.libs.junit.jupiter.engine)
    }

    tasks.test {
        useJUnitPlatform()
    }

}
