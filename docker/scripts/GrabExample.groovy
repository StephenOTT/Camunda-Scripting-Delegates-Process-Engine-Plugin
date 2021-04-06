@Grab(value = "org.apache.httpcomponents:fluent-hc:4.5.133333")
//THIS DOES NOT WORK: Waiting on: https://github.com/spring-projects/spring-framework/issues/26769

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
//import org.apache.http.client.fluent.Request


class GrabExample implements JavaDelegate{
    // Enable logging on to track download usage: http://docs.groovy-lang.org/latest/html/documentation/grape.html#Grape-Logging

    @Override
    void execute(DelegateExecution execution) throws Exception {



//        def result = Request.Get("https://raw.githubusercontent.com/StephenOTT/Camunda-Scripting-Delegates-Process-Engine-Plugin/main/docs/images/samplefile.txt")
//                .connectTimeout(10000)
//                .socketTimeout(10000)
//                .execute()
//                .returnContent()
//                .asString()

        println("HAPPY TIMES!")
//        println(result + "YES!!!")
    }
}