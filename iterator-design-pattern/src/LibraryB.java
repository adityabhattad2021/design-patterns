public class LibraryB {

    private Book[] books;
    private int booksIndex;

    LibraryB() {
        this.books = new Book[10];
        this.booksIndex = 0;
    }

    public void addBook(Book book) {
        if (booksIndex == books.length) {
            Book[] temp = new Book[(int) (books.length * 1.5)];
            System.arraycopy(books, 0, temp, 0, books.length);
            books = temp;
        }
        books[booksIndex++] = book;
    }

    public IIterator<Book> iterator() {
        return new LibraryBIterator();
    }

    private class LibraryBIterator implements IIterator<Book> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < booksIndex;
        }

        @Override
        public Book next() {
            return books[currentIndex++];
        }

    }

}
