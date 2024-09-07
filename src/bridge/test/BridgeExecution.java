package bridge.test;

import bridge.model.Abstraction;
import bridge.model.ConcreteImplementationA;
import bridge.model.ConcreteImplementationB;
import bridge.model.Implementation;
import bridge.model.RefinedAbstraction;

public class BridgeExecution {
    public static void main(String[] args) {

        Implementation imp1 = new ConcreteImplementationA();
        Implementation imp2 = new ConcreteImplementationB();

        Abstraction abstraction1 = new RefinedAbstraction(imp1);
        Abstraction abstraction2 = new RefinedAbstraction(imp2);


        abstraction1.feature1();
        abstraction1.feature2();
        abstraction1.feature3();

        abstraction2.feature1();
        abstraction2.feature2();
        abstraction2.feature3();
    }
}
