package Observer2;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    /**
     * View
     */
    @Override
    public void update() {
        System.out.println("bynary: " + Integer.toBinaryString(subject.getState()));
    }
    
}
