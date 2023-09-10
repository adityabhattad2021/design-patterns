public class WordDocument implements IDocument {
    
    private StringBuilder content = new StringBuilder();

    @Override
    public void addContent(String content) {
        this.content.append(content);
    }

    @Override
    public void viewDoc(String format) {
        System.out.println(
                "This is a Word Document" +
                        "[" + format + "]" +
                        content.toString());
    }

}
