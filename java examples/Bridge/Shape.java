package Bridge;

public abstract class Shape {
    protected DrawImplementation drawImplementation;

    protected Shape(DrawImplementation drawAPI) {
        this.drawImplementation = drawAPI;
    }

    public abstract void draw();
}
