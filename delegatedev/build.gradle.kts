val kotlinVersion: String by project
val spekVersion: String by project
val camundaVersion: String by project

plugins {
    id("org.jetbrains.kotlin.jvm")
}


dependencies {

    compileOnly(platform("org.camunda.bpm:camunda-bom:$camundaVersion"))
    compileOnly("org.camunda.bpm:camunda-engine")

//    compileOnly("org.camunda.bpm:camunda-engine-plugin-spin")
//    compileOnly("org.camunda.spin:camunda-spin-dataformat-json-jackson")

    compileOnly("org.codehaus.groovy:groovy-all:3.0.7")

}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}