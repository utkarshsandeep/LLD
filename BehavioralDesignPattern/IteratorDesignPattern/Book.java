package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.IteratorDesignPattern;

public class Book {
    public String bookName;
    public int price;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }
}
