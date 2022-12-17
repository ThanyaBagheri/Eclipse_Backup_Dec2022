package day44;

public class StringBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "OCA";
        book.author = "John";
        book.pages = 200;

        // Book{title='OCA', author='John', pages=200}
        System.out.println(book);

        String bookStr = book.toString();
        System.out.println(bookStr);
    }
}