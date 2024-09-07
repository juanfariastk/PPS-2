package state.model;

public class Context {
    private State state;

    public Context(State state){
        this.state = state;
    }
    
    public void setState(State actualState){
        this.state = actualState;
    }

    public void request1(){
        state.handle1(this);
    }

    public void request2(){
        state.handle2(this);
    }
}
