package org.camunda.bpm.run.plugin.springbeans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.ApplicationContext
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import workflowutils.WorkflowApi
import javax.annotation.PostConstruct
import javax.servlet.http.HttpServletRequest


@RestController
@ConditionalOnProperty("camunda.scriptingEndpoint")
@RequestMapping("\${camunda.scriptingEndpointRoot:/api}")
open class ApiController(
    private val applicationContext: ApplicationContext
) {

    @PostConstruct
    fun post(){
        println("Scripting Endpoint API Controller has started")
    }

    @RequestMapping("/{beanName}/**")
    fun getMappings(request: HttpServletRequest, @PathVariable beanName: String): ResponseEntity<Any?> {
        return applicationContext.getBean(beanName, WorkflowApi::class.java).handleRequest(request)
    }
}