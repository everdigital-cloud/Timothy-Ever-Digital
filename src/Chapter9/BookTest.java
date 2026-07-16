package Chapter9;

public class BookTest {
    public static void main(String[] args) {
        Book book=new Book("The Royal Men", 1990,"The Prince");
        System.out.println(book);
        PrintBooks printBook=new PrintBooks("The Royal Men", 1990,"The Prince", "The prince Press","123-45-6789");
        System.out.println(printBook);
        AudioBook audioBook=new AudioBook("The Royal Men", 1990,"The Prince", 20, 40,"Jane");
        System.out.println(audioBook);
    }
}
