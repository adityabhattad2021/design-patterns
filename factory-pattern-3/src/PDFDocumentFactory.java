public class PDFDocumentFactory extends DocumentFactory {
    public IDocument createDocument() {
        return new PDFDocument();
    }
}
