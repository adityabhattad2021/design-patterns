import java.util.ArrayList;

public class Section implements IDocumentComponent {

    ArrayList<IDocumentComponent> components;

    public Section() {
        this.components = new ArrayList<>();
    }

    public void addComponent(IDocumentComponent c) {
        components.add(c);
    }

    public void removeComponent(IDocumentComponent c) {
        components.remove(c);
    }

    public IDocumentComponent getComponent(int index) {
        return components.get(index);
    }

    public void print() {
        System.out.println("Section");
        for (IDocumentComponent c : components) {
            c.print();
        }
    }

}
