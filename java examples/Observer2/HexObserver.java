package Observer2;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * View
     */
    @Override
    public void update() {
        System.out.println("hex: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
    
}
