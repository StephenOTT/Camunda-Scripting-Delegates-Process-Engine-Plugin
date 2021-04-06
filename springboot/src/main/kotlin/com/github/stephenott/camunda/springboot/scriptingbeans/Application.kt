package com.github.stephenott.camunda.springboot.scriptingbeans

import org.camunda.bpm.run.plugin.springbeans.ScriptingBeansProcessEnginePlugin
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication(scanBasePackageClasses = [ScriptingBeansProcessEnginePlugin::class, Application::class]) // Only needed for custom implementation.  When used by Camunda Run, the package scanning will pick it up

@EnableProcessApplication
class Application

fun main(args: Array<String>) = runApplication<Application>(*args).let { }
