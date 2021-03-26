import org.camunda.bpm.engine.ProcessEngine
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.beans.factory.annotation.Autowired

class MyClass implements JavaDelegate {

    @Autowired ProcessEngine processEngine

    def myValue = 123

    def myMethod(Integer input){
        myValue = input
        return input
    }

    @Override
    void execute(DelegateExecution execution) throws Exception {
        println("This is a value printed from Test1.groovy")
        println("Test1: The Process Engine Name:" + processEngine.getName())
    }
}