package org.example.st1217611test2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class LibraryController implements Initializable {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    int currentBook = 0;
    @FXML
    private Text address;
    @FXML
    private Text books;
    @FXML
    private Text value;
    @FXML
    private Text title;
    @FXML
    private Text author;
    @FXML
    private Text isbn;
    @FXML
    private Text category;
    @FXML
    private Text price;

    private void setTexts() {
        title.setText(library.getBooks().get(currentBook).getTitle());
        author.setText(library.getBooks().get(currentBook).getAuthor());
        isbn.setText(library.getBooks().get(currentBook).getISBN());
        category.setText(library.getBooks().get(currentBook).getCategory());
        price.setText(String.valueOf(library.getBooks().get(currentBook).getPrice()));
    }
    @FXML
    protected void nextClick() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        library = new Library("60 Worsley St, Barrie, ON, L4M 1L6");
        book1 = new Book("Intro to Java","Dan Wright","1234567891011",79.99,"TextBook");
        book2 = new Book("The Maid","Nita Prose","9780735245259",24.95,"Fiction");
        book3 = new Book("Atomic Habits","James Clear","9780735211292",21.88,"Self Help");
        book4 = new Book("Plant You","Carleigh Bodrug","9780306923043",38.00,"CookBook");
        book5 = new Book("Five Little Indians","Michelle Good","9781443459181",18.39,"Indigenous");
        book6 = new Book("The Christie Affair","Nina De Gramont","9781250282132",38.00,"Romance");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        address.setText("Address: " + library.getAddress());
        books.setText("Number of Books: " + String.valueOf(library.getBooks().size()));
        value.setText("Value of Books: $" + String.valueOf(library.inventoryValue()));
        setTexts();
    }
}
