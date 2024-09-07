package bridge.model;

public class Abstraction {
    protected Implementation implementation;
    
    public Abstraction(Implementation implementation){
        this.implementation = implementation;
    }

    public void feature1(){
        implementation.method1();
    }

    public void feature2(){
        implementation.method2();
    }

    public void feature3(){
        implementation.method3();
    }
}
