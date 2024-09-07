package state.model;

public class ConcreteStateB implements State {

    @Override
    public void handle1(Context context){
        System.out.println("ConcreteStateB Handled successfully");
    }

    @Override
    public void handle2(Context context){
        System.out.println("ConcreteStateB Handled successfully");
        System.out.println("Haandle2 Changing state to ConcreteStateA");
        context.setState(new ConcreteStateA());
    }
}
