package org.camunda.bpm.run.plugin.springbeans

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication(scanBasePackageClasses = [ScriptingBeansConfig::class, ScriptingBeansProcessEnginePlugin::class])
@EnableProcessApplication
class Application

fun main(args: Array<String>) = runApplication<Application>(*args).let { }

