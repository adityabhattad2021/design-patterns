public class TextDocumentFactory extends DocumentFactory {

    @Override
    public IEditor createEditor() {
        return new TextEditor();
    }

    @Override
    public ITool createTool() {
        return new TextTool();
    }

    @Override
    public IComponent createComponent() {
        return new TextComponent();
    }
    
}
