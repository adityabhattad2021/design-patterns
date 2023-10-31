public class App {
    public static void main(String[] args) throws Exception {
        Subject subject = new Subject();
        new BinaryNumber(subject);
        new Octal(subject);
        new Hex(subject);
        subject.setValue(15);
        subject.setValue(10);
        subject.setValue(5);
    }
}
