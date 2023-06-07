package iterator.arraylist;

import iterator.Book;
import iterator.BookShelfIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelfArrayList implements Iterable<Book> {

    private List<Book> books;
    private int last = 0;

    public BookShelfArrayList() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfArrayListIterator(this);
    }

}
