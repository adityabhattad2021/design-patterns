public class TextComponent implements IComponent {

    @Override
    public void open() {
        System.out.println("TextComponent opened");
    }

    @Override
    public void save() {
        System.out.println("TextComponent saved");
    }

    @Override
    public void close() {
        System.out.println("TextComponent closed");
    }

    @Override
    public void mouseDown() {
        System.out.println("TextComponent mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("TextComponent mouseUp");
    }
    
}
