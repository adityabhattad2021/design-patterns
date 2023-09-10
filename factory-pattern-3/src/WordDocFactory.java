public class WordDocFactory extends DocumentFactory {
    public IDocument createDocument(){
        return new WordDocument();
    }
}
