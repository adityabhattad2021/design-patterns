public class App {
    public static void main(String[] args) throws Exception {
        TextEditor te = new TextEditor();

        te.write("Hello, World");
        te.showText();
        te.write("Hello, world is");
        te.showText();
        te.write("Hello, world is a bad place");
        te.showText();
        te.undo();
        te.showText();
        te.write("Hello, world is a great place");
        te.showText();
    }
}
