plugins {
    kotlin("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "5.1.0"
}

group = "net.savagelabs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
    maven("https://nexus.savagelabs.net/repository/maven-releases/")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.cryptomorin:XSeries:7.4.0")
    implementation("net.savagelabs:SkyblockX:1.5.2")
    compileOnly("org.spigotmc:spigot-api:1.16.3-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}