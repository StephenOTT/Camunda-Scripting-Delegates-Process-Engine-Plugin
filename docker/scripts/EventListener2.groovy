import org.camunda.bpm.engine.impl.history.event.HistoryEvent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.event.EventListener

class EventListener2{

    // Example of using a handler: This allows you to edit the handler code without having to update the Event Listener
    // because of the proxy requirement for the EventListener to work, you cannot refresh the bean: using the handler
    // pattern allows you to refresh the handler bean code at runtime.

    @Autowired
    @Qualifier("myHandler")
    Object handler

    @EventListener
    def listener(HistoryEvent historyEvent){
        handler.invokeMethod("handle", null)
    }

}