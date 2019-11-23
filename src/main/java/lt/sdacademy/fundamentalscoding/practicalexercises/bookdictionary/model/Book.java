package lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.model;

import java.util.List;

public class Book {
    private String title;
    private List<BookAuthor> authorsList;
    private int price;
    private int qty;

    public Book(String title, List<BookAuthor> authors, int price, int qty) {
        this.title = title;
        this.authorsList = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public List<BookAuthor> getAuthorsList() {
        return authorsList;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        return String.format("knygos pavadinimas: %s, Autorius: %s", title, authorsList.get(0).toString());
    }
}
