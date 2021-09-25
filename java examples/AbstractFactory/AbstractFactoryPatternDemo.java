package AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape s1 = shapeFactory.getShape("rectangle");
        s1.draw();

        Shape s2 = shapeFactory.getShape("square");
        s2.draw();

        
        shapeFactory = FactoryProducer.getFactory(true);

        Shape s3 = shapeFactory.getShape("rectangle");
        s3.draw();

        Shape s4 = shapeFactory.getShape("square");
        s4.draw();
    }
}
