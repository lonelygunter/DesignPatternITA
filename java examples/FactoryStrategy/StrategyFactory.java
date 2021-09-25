package FactoryStrategy;

public class StrategyFactory {
    public Strategy getStrategy(String strategyType) {
        if (strategyType.equalsIgnoreCase("add")) {
            return new OperationAdd();
        } else if (strategyType.equalsIgnoreCase("subtract")) {
            return new OperationSub();
        } else if (strategyType.equalsIgnoreCase("divide")) {
            return new OperationDiv();
        } else if (strategyType.equalsIgnoreCase("exp")) {
            return new OperationExp();
        }
        return null;
    }
}
