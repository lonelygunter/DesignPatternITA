package Bridge;

public class Circle extends Shape{
    private int x, y, radius;

    public Circle(DrawImplementation drawImplementation, int x, int y, int radius) {
        super(drawImplementation);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawImplementation.drawCircle(x, y, radius); // specifico dell'ambiente windowing usato a runtime
    }
}
