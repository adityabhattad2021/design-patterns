public class SpreadSheetComponent implements IComponent {

    @Override
    public void open() {
        System.out.println("SpreadSheetComponent opened");
    }

    @Override
    public void save() {
        System.out.println("SpreadSheetComponent saved");
    }

    @Override
    public void close() {
        System.out.println("SpreadSheetComponent closed");
    }

    @Override
    public void mouseDown() {
        System.out.println("SpreadSheetComponent mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("SpreadSheetComponent mouseUp");
    }
    
}
