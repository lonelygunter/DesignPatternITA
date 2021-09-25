package Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context c = new Context(new OperationAdd());

        System.out.println("10 + 5 = " + c.executeStrategy(10, 5));

        c = new Context(new OperationMult());
        System.out.println("10 * 5 = " + c.executeStrategy(10, 5));
    }
}
