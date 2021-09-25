package Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redC = new Circle(new RedCircle(), 100, 100, 10);
        Shape greC = new Circle(new GreenCircle(), 100, 100, 10);

        redC.draw();
        greC.draw();
    }
}
