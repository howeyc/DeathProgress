// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    rootProject.extra["compose_version"] = "1.0.4"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}