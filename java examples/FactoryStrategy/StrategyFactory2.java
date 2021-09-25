package FactoryStrategy;

public class StrategyFactory2 {
    public Strategy getStrategy(String strategyType) {
        try {
            Class cls = Class.forName("FactoryStrategy.Operation" + strategyType);
            Object obj = cls.getConstructor().newInstance();
            return (Strategy) obj;
        } catch (Exception e) {
            System.out.println("implementazione non pervenuta");
        }

        return null;
    }
}
