package org.example.st1217611test2;
import java.util.ArrayList;
public class Library {
    private String address;
    private ArrayList<Book> books;

    public Library(String address, ArrayList<Book> books) {
        setAddress(address);
        books = new ArrayList<Book>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address.trim();
        if (address.length() > 10) this.address = address;
        else throw new IllegalArgumentException("Address too short");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}