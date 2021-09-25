package Bridge;

public class RedCircle implements DrawImplementation{

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("cerchio rosso di: " + radius + x + y);    
    }
    
}
