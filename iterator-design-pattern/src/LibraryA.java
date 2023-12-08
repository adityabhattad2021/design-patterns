import java.util.ArrayList;
import java.util.List;

public class LibraryA {
    
    private List<Book> books;

    public LibraryA(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public IIterator<Book> iterator(){
        return new LibraryIterator();
    }

    public class LibraryIterator implements IIterator<Book> {

        private int currentIndex=0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            return books.get(currentIndex++);
        }

    }

}
