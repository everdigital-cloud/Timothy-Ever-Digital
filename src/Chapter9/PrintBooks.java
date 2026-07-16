package Chapter9;

public class PrintBooks extends Book {
    private final String publisher;
    private final String ISBN;
    public PrintBooks(String title, int year, String author, String publisher, String ISBN){
        super (title, year, author);
this.publisher=publisher;
this.ISBN=ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%s: %s%n%s: %s", super.toString(), "Publisher", getPublisher(), "ISBN", getISBN());
    }
}
