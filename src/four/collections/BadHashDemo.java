package four.collections;

import java.util.HashMap;
import java.util.Map;

public class BadHashDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Kolobok", 10);
        Book book2 = new Book("War and peace", 1800);
        Book book3 = new Book("Repka", 10);
        Map<Book, Book> bookMap = new HashMap<>();
        bookMap.put(book1, book1);
        bookMap.put(book2, book2);
        bookMap.put(book3, book3);
        for (Map.Entry<Book, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
        System.out.println(bookMap.get(book1));//Репка

        System.out.println(bookMap.size());
    }
}

class Book {
    private String name;
    private int length;

    public Book(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return length == book.length;
    }

    @Override
    public int hashCode() {
        System.out.println("Called hashCode() for book " + name + ". Returning " + length);
        return length;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}