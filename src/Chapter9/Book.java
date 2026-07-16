package Chapter9;

public class Book {
    private final String title;
    private final int year;
    private final String author;

    public Book(String title, int year, String author){
        if (year>2026){
            throw new IllegalArgumentException("Year should be < 2026 (the current year)");
        }
        this.year=year;
        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %d%n%s: %s", "Book title",getTitle(),"Year of publishing", getYear(), "Name of the Author", getAuthor());
    }
}
