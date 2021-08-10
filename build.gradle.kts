plugins {
    kotlin("jvm") version "1.5.10"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

repositories {
    mavenCentral()
    mavenLocal()
    maven(url = "https://papermc.io/repo/repository/maven-public/") //paper
    maven(url = "https://repo.dmulloy2.net/repository/public/") //protocollib
}

dependencies {
    implementation(kotlin("stdlib")) //kotlin
    compileOnly("com.destroystokyo.paper:paper-api:1.16.1-R0.1-SNAPSHOT") //paper
    compileOnly("com.comphenix.protocol:ProtocolLib:4.7.0") //protocollib
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "16"
    }
    shadowJar {
        archiveClassifier.set("dist")
    }
    create<Copy>("distJar") {
        from(shadowJar)
        into("E:\\@Bukkits\\PluginTestServer\\plugins")
    }
}