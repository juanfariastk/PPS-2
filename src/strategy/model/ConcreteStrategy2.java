package strategy.model;

public class ConcreteStrategy2 implements Strategy {
    @Override
    public void execute(){
        System.out.println("ConcreteStrategy 2 Executed!");
    }
}
