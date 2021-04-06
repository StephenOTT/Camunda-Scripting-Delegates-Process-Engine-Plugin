val kotlinVersion: String by project
val spekVersion: String by project
val camundaVersion: String by project

plugins {
    id("org.jetbrains.kotlin.jvm")
}


dependencies {
    compileOnly(platform("org.springframework.boot:spring-boot-dependencies:2.2.5.RELEASE"))
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")

//    runtimeOnly("org.jetbrains.kotlin:kotlin-scripting-jsr223:$kotlinVersion")

    compileOnly(platform("org.camunda.bpm:camunda-bom:$camundaVersion"))
    compileOnly("org.camunda.bpm:camunda-engine")

    compileOnly("org.springframework.boot:spring-boot-starter-web")

//    compileOnly("org.camunda.bpm:camunda-engine-plugin-spin")
//    compileOnly("org.camunda.spin:camunda-spin-dataformat-json-jackson")

    compileOnly("org.codehaus.groovy:groovy-all:3.0.7")
    compileOnly(project(":scriptingbeans"))
    compileOnly("org.apache.ivy:ivy:2.5.0")

}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}