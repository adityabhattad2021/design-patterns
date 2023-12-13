public class SpreadSheetFactory extends DocumentFactory{
    
    @Override
    public IEditor createEditor() {
        return new SpreadSheetEditor();
    }

    @Override
    public ITool createTool() {
        return new SpreadSheetTool();
    }

    @Override
    public IComponent createComponent() {
        return new SpreadSheetComponent();
    }
    

}
