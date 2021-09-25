package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state; // Model

    public Subject(int state) {
        this.state = state;
        observers = new ArrayList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
