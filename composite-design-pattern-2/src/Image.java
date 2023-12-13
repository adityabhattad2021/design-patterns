public class Image implements IDocumentComponent {

    private String url;

    public Image(String url) {
        this.url = url;
    }

    public void print() {
        System.out.println(url);
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
