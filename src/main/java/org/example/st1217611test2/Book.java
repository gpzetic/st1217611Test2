package org.example.st1217611test2;
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String category;
    private double price;

    public Book(String title, String author, String ISBN, String category, double price) {
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
        this.ISBN = ISBN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}