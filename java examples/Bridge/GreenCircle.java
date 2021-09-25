package Bridge;

public class GreenCircle implements DrawImplementation{

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("cerchio verde di: " + radius + x + y);    
    }
    
}
