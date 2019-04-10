plugins {
    java
}

group = "org.mav"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.rabbitmq", "amqp-client", "5.7.0")
    implementation("org.slf4j", "slf4j-simple", "1.6.1")
    implementation("org.slf4j", "slf4j-api", "1.7.26")
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}