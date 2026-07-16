package Chapter9;

public class AudioBook extends Book{
    private final double bookSize;
    private  final double playLength;
    private final  String playArtistName;
    public AudioBook(String title, int year, String author, double bookSize, double playLength, String playArtistName){
        super(title,year,author);
        if (bookSize<0.0){
            throw new IllegalArgumentException("Book size should be > 0.0MB");
        }
        if (playLength<0.0){
            throw new IllegalArgumentException("play length should be > 0.0 sec/min/hr");
        }
        this.bookSize=bookSize;
        this.playLength=playLength;
        this.playArtistName=playArtistName;
    }

    public double getBookSize() {
        return bookSize;
    }

    public double getPlayLength() {
        return playLength;
    }

    public String getPlayArtistName() {
        return playArtistName;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%s: %.2f%s%n%s: %.2f%s%n%s: %s%n", super.toString(),"Book size", getBookSize(), "mb/kb",
                "Play length",getPlayLength(),"min/sec", "Playback Artist's Name",getPlayArtistName() );
    }
}
