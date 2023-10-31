public class Hex implements IObserver {

    public int value;
    
    public Hex(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(int value) {
        this.value=value;
        System.out.println("Hex: " + Integer.toHexString(value));
    }

    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

}
