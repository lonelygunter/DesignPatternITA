package FactoryMethod;

public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        ShapeFactory sf1 = new ShapeFactory();

        Shape s1 = sf1.getShape("circle");
        s1.draw();

        Shape s2 = sf1.getShape("rectangle");
        s2.draw();
    }
}
