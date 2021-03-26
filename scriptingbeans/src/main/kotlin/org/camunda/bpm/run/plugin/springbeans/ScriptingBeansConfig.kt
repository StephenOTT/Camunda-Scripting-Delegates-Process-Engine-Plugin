package org.camunda.bpm.run.plugin.springbeans

import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@Configuration
@ImportResource("\${camunda.scriptingBeansXml:/file:/camunda/configuration/camunda-beans.xml}")
class ScriptingBeansConfig(){

    val logger = LoggerFactory.getLogger(ScriptingBeansProcessEnginePlugin::class.java)

}