plugins {
    id("org.liquibase.gradle") version "2.0.4"
}

repositories {
    mavenCentral()
}

dependencies {
    liquibaseRuntime("org.hsqldb:hsqldb:2.5.1")
    liquibaseRuntime("org.liquibase:liquibase-core:3.8.1")
    liquibaseRuntime("ch.qos.logback:logback-core:1.2.3")
    liquibaseRuntime("ch.qos.logback:logback-classic:1.2.3")
    liquibaseRuntime("javax.xml.bind:jaxb-api:2.3.1") // Java 9+ only
}