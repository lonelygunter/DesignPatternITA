package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactor();
        } else {
            return new ShapeFactory();
        }
    }
}
