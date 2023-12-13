public class SpreadSheetEditor implements IEditor{

    @Override
    public void open() {
        System.out.println("SpreedSheetEditor open");
    }

    @Override
    public void save() {
        System.out.println("SpreedSheetEditor save");
    }

    @Override
    public void close() {
        System.out.println("SpreedSheetEditor close");
    }
    
}
