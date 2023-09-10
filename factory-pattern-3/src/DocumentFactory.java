public abstract class DocumentFactory {
    
    public abstract IDocument createDocument();

    public void addContentToDoc(IDocument d,String c){
        d.addContent(c);
    }

    public void dispayContent(IDocument d,String format){
        d.viewDoc(format);
    }

}
