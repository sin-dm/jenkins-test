plugins {
    kotlin("jvm") version "1.5.30"
}

group = "ru.sindm"
version = "1.0"

val allureVersion = "2.15.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.qameta.allure:allure-java-commons:$allureVersion")
    testImplementation("io.qameta.allure:allure-attachments:$allureVersion")
    testImplementation("io.qameta.allure:allure-generator:$allureVersion")
    testImplementation("io.qameta.allure:allure-httpclient:$allureVersion")
    testImplementation("io.qameta.allure:allure-junit5:$allureVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

