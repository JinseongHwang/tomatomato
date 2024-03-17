import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    kotlin("plugin.jpa") version "1.9.22"
}

group = "com.kurly.ft"
version = "0.0.1-SNAPSHOT"
val slackSdkVersion = "1.38.3"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    // api + common
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("io.github.oshai:kotlin-logging-jvm:5.1.0")

    // mongodb
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")

    // slack sdk
    implementation("com.slack.api:bolt:$slackSdkVersion")
    implementation("com.slack.api:bolt-servlet:$slackSdkVersion")
    implementation("com.slack.api:bolt-jetty:$slackSdkVersion")
    implementation("org.slf4j:slf4j-simple:1.7.36")

    // test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
