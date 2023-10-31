public class Octal implements IObserver {

    public int value;
    
    public Octal(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(int value) {
        this.value=value;
        System.out.println("Octal: " + Integer.toOctalString(value));
    }

    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

}
