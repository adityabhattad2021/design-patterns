import shapes.Circle;
import shapes.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        editor.drawShape(new Circle());
        editor.drawShape(new Rectangle());
    }
}
