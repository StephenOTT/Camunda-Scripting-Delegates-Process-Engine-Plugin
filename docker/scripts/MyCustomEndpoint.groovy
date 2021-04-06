
import org.camunda.bpm.engine.ProcessEngine
import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.engine.TaskService
import workflowutils.WorkflowApi
import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity

import javax.servlet.http.HttpServletRequest

class TestController implements WorkflowApi {

    //The endpoint is configured through the workflowutils.WorkflowApi interface.
    // The interface provides the wrapper utils for managing HTTP requests.

    @Autowired
    ProcessEngine processEngine

    @Autowired
    TaskService taskService

    @Autowired
    RuntimeService runtimeService

//    @Override
//    ResponseEntity<Object> handleRequest(@NotNull HttpServletRequest request) {
//        return ResponseEntity.ok("123")
//    }

    @Override
    ResponseEntity<Object> handleGet(@NotNull HttpServletRequest request) {
        return ResponseEntity.ok("YES!!! queryString: " + request.queryString)
    }

}