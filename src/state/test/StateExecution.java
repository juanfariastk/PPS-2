package state.test;

import state.model.ConcreteStateA;
import state.model.Context;

public class StateExecution {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request1();
        context.request2();

        context.request2();
        context.request1();
        context.request2();
    }
}
