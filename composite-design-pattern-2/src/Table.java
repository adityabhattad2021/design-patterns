import java.lang.reflect.Array;
import java.util.ArrayList;

public class Table implements IDocumentComponent {

    ArrayList<IDocumentComponent> components;
    
    public Table() {
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
        System.out.println("Table");
        for (IDocumentComponent c : components) {
            c.print();
        }
    }
    
}
