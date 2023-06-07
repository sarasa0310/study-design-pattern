package iterator;

import iterator.arraylist.BookShelfArrayList;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
//        BookShelf myBookShelf = new BookShelf(4);
        BookShelfArrayList myBookShelf = new BookShelfArrayList();

        myBookShelf.appendBook(new Book("커리어 스킬"));
        myBookShelf.appendBook(new Book("객체지향의 사실과 오해"));
        myBookShelf.appendBook(new Book("도메인 주도 개발 시작하기"));
        myBookShelf.appendBook(new Book("디자인 패턴 입문"));
        myBookShelf.appendBook(new Book("인간관계론"));
        myBookShelf.appendBook(new Book("자기관리론"));

        Iterator<Book> it = myBookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for (Book book : myBookShelf) {
            System.out.println(book.getName());
        }
    }
}
