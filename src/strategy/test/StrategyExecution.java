package strategy.test;

import strategy.model.ConcreteStrategy1;
import strategy.model.ConcreteStrategy2;
import strategy.model.Context;
import strategy.model.Strategy;

public class StrategyExecution {
    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        Context context = new Context();

        context.setStrategy(strategy1);
        context.executeStrategyMethod();

        Strategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.executeStrategyMethod();

    }
}
