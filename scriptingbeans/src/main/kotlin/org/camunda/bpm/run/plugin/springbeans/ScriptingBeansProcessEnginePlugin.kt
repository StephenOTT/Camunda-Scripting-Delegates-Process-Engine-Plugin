package org.camunda.bpm.run.plugin.springbeans

import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl
import org.springframework.stereotype.Component

@Component
open class ScriptingBeansProcessEnginePlugin(
    val config: ScriptingBeansConfig
): AbstractProcessEnginePlugin() {

    override fun preInit(processEngineConfiguration: ProcessEngineConfigurationImpl?) {
        config.logger.info("Scripting Beans Plugin has started.")

        //@TODO add more config options
        //@TODO add folder monitoring so you dont need to update camunda-beans.xml
        //@TODO add kotlin script language support
        //@TODO deal with warning message: Cannot find template location: classpath:/templates/ (please add some templates, check your Groovy configuration, or set spring.groovy.template.check-template-location=false)
    }

}