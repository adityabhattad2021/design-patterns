public interface IDocumentComponent {
    public void print();
    public void addComponent(IDocumentComponent c);
    public void removeComponent(IDocumentComponent c);
    public IDocumentComponent getComponent(int index);
}
