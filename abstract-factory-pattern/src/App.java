public class App {
    public static void main(String[] args) throws Exception {
        
        ApplicationExample app1 = new ApplicationExample(new TextDocumentFactory());   
        app1.createUI();
        app1.open();
        app1.save();
        app1.close();
        System.out.println(app1);
        
        ApplicationExample app2 = new ApplicationExample(new SpreadSheetFactory());
        app2.createUI();
        app2.open();
        app2.save();
        app2.close();
        System.out.println(app2);

    }
}
