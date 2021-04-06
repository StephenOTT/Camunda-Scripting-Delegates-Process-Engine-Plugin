import org.camunda.bpm.engine.delegate.ExpressionDelegate
import org.camunda.bpm.engine.delegate.VariableScope

class Decision1 implements ExpressionDelegate{

    @Override
    Object evaluate(VariableScope variableScope) {
        return true
    }
}