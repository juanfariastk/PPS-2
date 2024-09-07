package strategy.model;

public class Context {
    private Strategy strategy;

    public void setStrategy (Strategy newStrategy){
        this.strategy = newStrategy;
    }

    public void executeStrategyMethod(){
        this.strategy.execute();
    }
}
