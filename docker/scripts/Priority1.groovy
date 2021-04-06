import org.camunda.bpm.engine.delegate.VariableScope
import org.camunda.bpm.engine.delegate.ExpressionDelegate
import org.jetbrains.annotations.NotNull

class Priority1 implements ExpressionDelegate{

    @Override
    Object evaluate(@NotNull VariableScope execution) {
        return 100
    }
}
