package Observer2;

import java.util.TimerTask;

public class TimerHelper extends TimerTask{
    public static int i;
    public static Subject s;

    public TimerHelper(Subject s) {
        this.s = s;
        this.i = s.getState();
    }

    @Override
    public void run() {
        s.setState(i++);
    }
}
