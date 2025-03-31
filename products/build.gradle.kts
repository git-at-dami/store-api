plugins {
    id("java")
}

group = "com.protheolabs"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":choreography"))
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc:3.2.4")
    implementation("org.springframework.boot:spring-boot-starter-webflux:3.2.4")
    implementation("org.springframework.cloud:spring-cloud-stream:4.2.1")
    implementation("org.springframework.cloud:spring-cloud-stream-binder-kafka:4.2.1")
    implementation("org.springframework.kafka:spring-kafka:3.1.5")
    runtimeOnly("org.postgresql:postgresql:42.7.3")
    runtimeOnly("org.postgresql:r2dbc-postgresql:1.1.6")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}