public class BinaryNumber implements IObserver {

    public int value;

    public BinaryNumber(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(int value) {
        this.value=value;
        System.out.println("Binary: " + Integer.toBinaryString(value));
    }

    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

}
