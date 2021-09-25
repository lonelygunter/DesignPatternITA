package FactoryStrategy;

public class StrategyPatternDemo2 {
    public static void main(String[] args) {
        StrategyFactory2 sf = new StrategyFactory2();

        Context c = new Context(sf.getStrategy(args[0]));

        try {
            System.out.println(args[1] + " " + args[0] + " " + args[2] + " = " + c.executeStrategy(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        } catch (ArithmeticException e) {
            System.out.println("divisione per 0");
        } catch (NullPointerException e) {
            System.out.println("operazione non riconosciuta");
        }
    }
}
