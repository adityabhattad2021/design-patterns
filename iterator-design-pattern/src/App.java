public class App {
    public static void main(String[] args) throws Exception {
        LibraryA library = new LibraryA();

        library.addBook(new Book("Ready Player 1"));
        library.addBook(new Book("To Kill a Mockingbird"));
        library.addBook(new Book("The Great Gatsby"));

        LibraryB anotherLibrary = new LibraryB();


        anotherLibrary.addBook(new Book("Deep Work"));
        anotherLibrary.addBook(new Book("The subtle art of not giving a fuck"));
        anotherLibrary.addBook(new Book("Atomic Habits"));

        IIterator<Book> iterator = library.iterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }

        iterator = anotherLibrary.iterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
 