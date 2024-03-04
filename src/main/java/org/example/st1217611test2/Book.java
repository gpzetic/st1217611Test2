package org.example.st1217611test2;

import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String category;
    private double price;

    public Book(String title, String author, String ISBN, double price, String category) {
        setTitle(title);
        setAuthor(author);
        setISBN(ISBN);
        setCategory(category);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title.trim();
        if (title.length() < 4) {
            throw new IllegalArgumentException("Title is too short");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author.trim();
        if (author.length() < 2) {
            throw new IllegalArgumentException("Author name is too short");
        }
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        ISBN = ISBN.trim();
        if (ISBN.matches("\\d{13}") && ISBN.length() == 13) this.ISBN = ISBN;
        else throw new IllegalArgumentException("The isbn should consist of 13 numeric characters.");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        List<String> validCategories = Arrays.asList("Mystery", "Thriller", "Horror", "Historical",
                "Romance", "Western", "Fantasy", "TextBook", "CookBook", "Self Help", "Fiction",
                "Indigenous");
        category = category.trim();
        if (validCategories.contains(category)) this.category = category;
        else throw new IllegalArgumentException("Category is invalid");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 && price <= 2000) this.price = price;
        else throw new IllegalArgumentException("Price too high or too low");
    }
}