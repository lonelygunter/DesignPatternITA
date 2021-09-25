package Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Cerchio normale:");
        circle.draw();

        System.out.println("Cerchio rosso:");
        redCircle.draw();

        System.out.println("Rettangolo rosso:");
        redRectangle.draw();
    }
}
