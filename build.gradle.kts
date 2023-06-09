plugins {
    id("com.android.application").version("8.0.0").apply(false)
    id("com.android.library").version("8.0.0").apply(false)
    kotlin("android").version("1.8.10").apply(false)
    kotlin("multiplatform").version("1.8.10").apply(false)
    id("com.github.gmazzo.buildconfig") apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
