import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate

class Delegate1 implements JavaDelegate{

    // See docker/scripts folder for further example.

    @Override
    void execute(DelegateExecution execution) throws Exception {
        // do something
    }
}

