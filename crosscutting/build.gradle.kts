plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    //Arrow
    implementation("io.arrow-kt:arrow-core:0.10.5")
    implementation("io.arrow-kt:arrow-syntax:0.10.5")

    //Log dependencies
    implementation("org.zalando:logbook-spring-boot-starter:2.1.0")
}
