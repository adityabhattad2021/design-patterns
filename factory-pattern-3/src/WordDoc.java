public class WordDoc implements IDocument {

    private StringBuilder content = new StringBuilder();

    public void addContent(String content) {
        this.content.append(content);
    }

    public void viewDoc(String format) {
        System.out.println(
                "The content inside word doc is: " +
                        "[" + format + "] " +
                        content);
    }

}
