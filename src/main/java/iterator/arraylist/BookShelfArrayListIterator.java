package iterator.arraylist;

import iterator.Book;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfArrayListIterator implements Iterator<Book> {

    private BookShelfArrayList bookShelf;
    private int index;

    public BookShelfArrayListIterator(BookShelfArrayList bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
