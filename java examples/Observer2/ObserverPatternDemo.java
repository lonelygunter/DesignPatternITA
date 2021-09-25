package Observer2;

import java.util.Timer;
import java.util.TimerTask;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject s = new Subject(10);

        new DecimalObserver(s);
        new BinaryObserver(s);
        new HexObserver(s);

        System.out.println("cambio stato incrementando il valore ogni secondo");

        Timer t = new Timer();
        TimerTask tt = new TimerHelper(s);
        t.schedule(tt, 0, 1000);
    }
}
