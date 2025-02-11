package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator{

    private List<Book> bookList;
    private int index;

    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
