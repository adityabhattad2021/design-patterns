import java.util.ArrayList;
import java.util.List;

public class Subject {

    public int value;
    private List<IObserver> observers = new ArrayList<IObserver>();

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(value);
        }
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

}
