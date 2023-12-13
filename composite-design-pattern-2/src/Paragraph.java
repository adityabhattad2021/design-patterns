public class Paragraph implements IDocumentComponent {

    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }

    // do nothing
    public void addComponent(IDocumentComponent c) {
        throw new UnsupportedOperationException();
    }

    // do nothing
    public void removeComponent(IDocumentComponent c) {
        throw new UnsupportedOperationException();
    }

    // do nothing
    public IDocumentComponent getComponent(int index) {
        throw new UnsupportedOperationException();
    }
    
}
