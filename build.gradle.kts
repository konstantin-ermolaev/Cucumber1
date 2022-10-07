plugins {
    kotlin("jvm") version "1.6.10"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
    testImplementation("io.cucumber:cucumber-java8:7.8.0")
    implementation("io.cucumber:cucumber-java:7.8.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.8.0")
    testImplementation("io.cucumber:cucumber-junit:7.8.1") //
    testImplementation("info.cukes:cucumber-junit:1.2.6")
    implementation("org.apache.poi:poi:5.2.3")
    implementation("org.apache.poi:poi-ooxml:5.2.3")
    implementation("org.seleniumhq.selenium:selenium-java:4.5.0")
    testImplementation("org.testng:testng:7.6.1")
    testImplementation("org.slf4j:slf4j-log4j12:2.0.3")
}


/*
tasks.test{
    useJUnitPlatform()
}
*/


/*
tasks.withType<Test> {
    useJUnitPlatform()
    ignoreFailures = true
}*/
