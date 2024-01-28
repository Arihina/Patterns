package Strategy;

public class ContextStrategy {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void action() {
        if (strategy != null) {
            strategy.action();
        }
        else {
            System.out.println("The strategy is not defined");
        }
    }
}
