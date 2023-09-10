public class PDFDocument implements IDocument {

    private StringBuilder content = new StringBuilder();

    @Override
    public void addContent(String content) {
        this.content.append(content);
    }

    @Override
    public void viewDoc(String format) {
        System.out.println(
                "The content inside PDF is " +
                        "[" + format + "] " +
                        content.toString());
    }

}
