package org.camunda.bpm.engine.org.camunda.bpm.engine.impl.bpmn.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExpressionDelegate;
import org.camunda.bpm.engine.impl.delegate.DelegateInvocation;

public class ExpressionDelegateInvocation extends DelegateInvocation {

    protected final ExpressionDelegate delegateInstance;
    protected final DelegateExecution execution;

    public ExpressionDelegateInvocation(ExpressionDelegate delegateInstance, DelegateExecution execution) {
        super(execution, null);
        this.delegateInstance = delegateInstance;
        this.execution = execution;
    }

    protected void invoke() throws Exception {
        invocationResult = delegateInstance.evaluate(execution);
    }

}