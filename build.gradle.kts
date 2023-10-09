plugins {
    id("java")
}

group = "us.and.everyone.else.who.wants.to.contribute"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

fun useSpigotRepo() {
    repositories {
        maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

fun ohAndAlsoUseSpigotAsDependency(version: String) {
    dependencies {
        implementation("org.spigotmc:spigot-api:${version}-R0.1-SNAPSHOT")
    }
}

useSpigotRepo()

// ...

// ...

ohAndAlsoUseSpigotAsDependency("1.8.8") // best version

val mctestdir = File("C:\\mctest\\plugins")
if(mctestdir.isDirectory) {
    tasks {
        "jar"(Jar::class) {
            archiveFileName.set("shitlib.jar")
            destinationDirectory.set(mctestdir)
        }
    }
} else {
    println("C:\\mctest\\plugins is not a directory, not copying jar")
}

// Oh yeah we use spigot 1.8 so better only use java 8 too
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(Integer.valueOf("8")))
    }
}