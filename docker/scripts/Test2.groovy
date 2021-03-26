import org.camunda.bpm.engine.ProcessEngine
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.beans.factory.annotation.Autowired

class MyClass2 implements JavaDelegate {

    @Autowired ProcessEngine processEngine

    def myValue = 123

    def myMethod(Integer input){
        myValue = input
        return input
    }

    @Override
    void execute(DelegateExecution execution) throws Exception {
        println("This is a value printed from Test2.groovy")
        println("Test2: The Process Engine Name:" + processEngine.getName())
    }
}