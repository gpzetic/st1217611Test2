public class Library {
    private String address;
    private ArrayList<Book> books;

    public Library(String address, ArrayList<Book> books) {
        setAddress(address);
        setBooks(books);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.charAt(0))
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}