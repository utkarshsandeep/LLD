package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Science", 100));
        bookList.add(new Book("Maths", 200));
        bookList.add(new Book("English", 300));
        bookList.add(new Book("Hindi", 400));

        Library lib = new Library(bookList);
        Iterator iterator = lib.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName() + " " + book.getPrice());
        }
    }
}
