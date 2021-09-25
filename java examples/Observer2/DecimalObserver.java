package Observer2;

public class DecimalObserver extends Observer {

    public DecimalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * View
     */
    @Override
    public void update() {
        System.out.println("decimal: " + subject.getState());
    }
    
}
