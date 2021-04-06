package org.camunda.bpm.run.plugin.myplugin;
// MUST HAVE a package under the org.camunda.bpm.run namespace to ensure that Camunda-Run picks up the components as part of the ComponentScan.

import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl

class ProcessEnginePluginExample extends AbstractProcessEnginePlugin{
    @Override
    void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        println("This is the pre-init plugin!!")
    }
}
