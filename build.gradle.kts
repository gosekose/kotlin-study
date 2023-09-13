plugins {
    kotlin("jvm") version "1.9.0"
    application
}

allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply {
        apply(plugin = "kotlin")
        apply(plugin = "kotlin-kapt")
    }

    dependencies {
        testImplementation(kotlin("test"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    }

}


dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}