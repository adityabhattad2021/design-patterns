public class ApplicationExample {

    public IEditor editor;
    public ITool tool;
    public IComponent component;

    private DocumentFactory factory;

    public ApplicationExample(DocumentFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        editor = factory.createEditor();
        tool = factory.createTool();
        component = factory.createComponent();
    }

    public void mouseDown() {
        tool.mouseDown();
    }

    public void mouseUp() {
        tool.mouseUp();
    }

    public void save() {
        editor.save();
    }

    public void open() {
        editor.open();
    }

    public void close() {
        editor.close();
    }

    // ... and so on

    public String toString() {
        return "Application: " + factory.toString() + "\n" +
               "Editor: " + editor.toString() + "\n" +
               "Tool: " + tool.toString() + "\n" +
               "Component: " + component.toString() + "\n";
    }
    
}
