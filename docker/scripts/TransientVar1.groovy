import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate

class TransientVar1 implements JavaDelegate {

    @Override
    void execute(DelegateExecution execution) throws Exception {
//        def stringVar = Java('org.camunda.bpm.engine.variable.Variables').stringValue("myString", true)
//        execution.setVariableLocal("stringVar", stringVar)

        def boolVar = org.camunda.bpm.engine.variable.Variables.booleanValue(true, true)
        execution.setVariableLocal("boolVar", boolVar)

        def dateVar = org.camunda.bpm.engine.variable.Variables.dateValue(new Date(), true)
        execution.setVariableLocal("dateVar", dateVar)
    }
}

