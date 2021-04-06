package com.github.stephenott.camunda.springboot.scriptingbeans.restcontroller

import org.camunda.bpm.engine.ProcessEngine
import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.engine.TaskService
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.DelegateTask
import org.camunda.bpm.engine.impl.history.event.HistoryEvent
import org.camunda.bpm.run.plugin.springbeans.WorkflowApi
import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.http.ResponseEntity

import javax.servlet.http.HttpServletRequest

// MUST BE proxy-target-class="true" in the bean config.  Does not support bean fresh because of the annotation.
class EventListener1 {

    @Autowired
    ProcessEngine processEngine

    @Autowired
    TaskService taskService

    @Autowired
    RuntimeService runtimeService

    public void onTaskEvent(DelegateTask taskDelegate) {
        println("Delegate Task Event1")
    }

    @EventListener
    public void onExecutionEvent(DelegateExecution executionDelegate) {
        println("Delegate Execution Event1")
    }

    @EventListener
    public void onHistoryEvent(HistoryEvent historyEvent) {
        println("History Event1")
    }
}