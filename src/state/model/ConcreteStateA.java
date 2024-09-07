package state.model;

public class ConcreteStateA implements State {

    @Override
    public void handle1(Context context){
        System.out.println("ConcreteStateA Handled successfully");
        System.out.println("Haandle1 Changing state to ConcreteStateB");
        context.setState(new ConcreteStateB());
    }

    @Override
    public void handle2(Context context){
        System.out.println("ConcreteStateA Handled successfully");
    }

}
