buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://artifact.bytedance.com/repository/Volcengine/") }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://artifact.bytedance.com/repository/Volcengine/") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}