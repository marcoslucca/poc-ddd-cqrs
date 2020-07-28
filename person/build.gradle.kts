plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":crosscutting"))

    //Arrow
    implementation("io.arrow-kt:arrow-core:0.10.5")
    implementation("io.arrow-kt:arrow-syntax:0.10.5")

    //Jdk
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    //Spring Boot
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")

    //Database
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.hibernate:hibernate-envers")
    implementation("org.postgresql:postgresql")
    implementation("com.zaxxer:HikariCP:3.4.5")

    //Jackson
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    //Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.mockk:mockk:1.9.3")
}
