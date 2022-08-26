import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.7.3")
}

task("runIntuitive", JavaExec::class) {
    main = "org.crispycoding.intuitive.ApplicationKt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("runMainFunctionBuilder", JavaExec::class) {
    main = "org.crispycoding.mainFunctionBuilder.ApplicationKt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("runSpringIoc", JavaExec::class) {
    main = "org.crispycoding.springIoc.ApplicationKt"
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}
