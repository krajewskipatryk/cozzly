plugins {
    id("org.springframework.boot") version "3.4.4"
    id("io.spring.dependency-management") version "1.1.7"
    id("application")
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
}

application {
    mainClass = "com.cozzly.houses.HousesApplication"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}


java {
    sourceCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}