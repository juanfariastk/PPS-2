package bridge.model;

public class RefinedAbstraction extends Abstraction {
    
    public RefinedAbstraction(Implementation implementation){
        super(implementation);
    }

    @Override
    public void feature1(){
        implementation.method1();
    }

    @Override
    public void feature2(){
        implementation.method2();
    }

    @Override
    public void feature3(){
        implementation.method3();
    }
}
