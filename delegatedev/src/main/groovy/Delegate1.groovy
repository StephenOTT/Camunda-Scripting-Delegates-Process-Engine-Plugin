import org.camunda.bpm.engine.ProcessEngine
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.beans.factory.annotation.Autowired

class Delegate1 implements JavaDelegate{

    @Autowired ProcessEngine processEngine // Example of using autowire

    @Override
    void execute(DelegateExecution execution) throws Exception {
        //do something
    }
}