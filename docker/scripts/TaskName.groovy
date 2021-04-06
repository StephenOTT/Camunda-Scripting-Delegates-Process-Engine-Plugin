import org.camunda.bpm.engine.delegate.VariableScope
import org.camunda.bpm.engine.delegate.ExpressionDelegate
import org.jetbrains.annotations.NotNull

class TaskName implements ExpressionDelegate{

    @Override
    Object evaluate(@NotNull VariableScope execution) {
        return "My Task Name!!"
    }
}
