plugins {
  java
  id("com.ewerk.gradle.plugins.querydsl") version "2.0.0-SNAPSHOT"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.querydsl:querydsl-core:4.2.1")
  implementation("com.querydsl:querydsl-jpa:4.2.1")
  implementation("javax.persistence:javax.persistence-api:2.2")
  compileOnly("org.projectlombok:lombok:1.18.8")

  annotationProcessor("org.projectlombok:lombok:1.18.8")
  // fix for: Unable to load class 'javax.annotation.Generated'.
  implementation("javax.annotation:javax.annotation-api:1.3.2")
}

querydsl {
  isJpa = true
  isLombok = true
}