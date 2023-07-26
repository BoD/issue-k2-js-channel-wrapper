plugins {
    kotlin("multiplatform") version "1.9.20-dev-7405"
}

group = "org.example"
version = "1.0.0-SNAPSHOT"

repositories {
    maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/") }
    mavenCentral()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }

    js {
        nodejs()
        compilations.all {
            kotlinOptions.apiVersion = "1.6"
            kotlinOptions.languageVersion = "2.0"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Coroutines
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jsMain by getting
        val jsTest by getting
    }
}
