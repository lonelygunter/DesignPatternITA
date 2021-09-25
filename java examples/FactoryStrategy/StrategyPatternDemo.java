package FactoryStrategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        StrategyFactory sf = new StrategyFactory();

        Context c = new Context(sf.getStrategy("add"));

        System.out.println("10 + 5 = " + c.executeStrategy(10, 5));

        c = new Context(sf.getStrategy("multiply"));
        System.out.println("10 * 5 = " + c.executeStrategy(10, 5));
    }
}
