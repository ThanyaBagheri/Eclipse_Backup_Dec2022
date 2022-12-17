package day44;

public class CompareBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java";
        book.author = "John";
        book.pages = 200;

        Book bookOne = new Book();
        bookOne.title = "Java";
        bookOne.author = "John";
        bookOne.pages = 200;

        // How do you compare two customer objects?
        // we can override equals method and give the correct
        // way to compare our object of this class
        // if we don't override equals it works as == operator

        System.out.println(book.equals(bookOne)); // false
    }
}
