public class App {
    public static void main(String[] args) throws Exception {
        IDocumentComponent doc = new Section();
        doc.addComponent(new Paragraph("Paragraph 1"));
        doc.addComponent(new Paragraph("Paragraph 2"));
        doc.addComponent(new Image("image.png"));
        doc.addComponent(new Paragraph("Paragraph 3"));
        doc.addComponent(new Paragraph("Paragraph 4"));
        IDocumentComponent table = new Table();
        table.addComponent(new Paragraph("Paragraph 5"));
        table.addComponent(new Paragraph("Paragraph 6"));
        doc.addComponent(table);
        
        doc.print();
    }
}
