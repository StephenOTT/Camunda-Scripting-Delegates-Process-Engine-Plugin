package org.camunda.bpm.engine.delegate;

public interface ExpressionDelegate {

    Object evaluate(VariableScope execution);

}