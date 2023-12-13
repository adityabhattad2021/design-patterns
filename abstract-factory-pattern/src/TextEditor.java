public class TextEditor implements IEditor {

    @Override
    public void open() {
        System.out.println("TextEditor open");
    }

    @Override
    public void save() {
        System.out.println("TextEditor save");
    }

    @Override
    public void close() {
        System.out.println("TextEditor close");
    }
    
}
