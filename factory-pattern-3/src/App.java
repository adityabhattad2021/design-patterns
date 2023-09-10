import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        DocumentFactory df = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred document type: ");
        String type = scanner.nextLine();
        scanner.close();
        if(type.equalsIgnoreCase("pdf")){
            df=new PDFDocumentFactory();
        }else if(type.equalsIgnoreCase("word")){
            df= new WordDocFactory();
        }else{
            throw new Exception("Invalid doc type");
        }

        IDocument doc = df.createDocument();
        df.addContentToDoc(doc, "This sample content");
        df.dispayContent(doc, "ITALIC");
    }
}
