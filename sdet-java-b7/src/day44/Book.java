package day44;

import java.util.Objects;

/*
 * What's Inheritance in java?
 * When one class can inherit visible variables and methods from another class
 * Parent child relationship
 * Super class and subclass
 *
 * - Java supports only single inheritance. We can extend one class at the time
 * - Object class is a super(parent) class for all classes in java.
 *   Java wants to give common behaviors for all objects that will be created
 *   - equals() and hashCode() the way we compare objects
 *   - toString() string representation of object
 */
public class Book extends Item {
    public String title;
    public String author;
    public int pages;
    public int length;

    @Override
    public void sell() {
        System.out.println("Book is sold");

        // super refers to parent's class object
        System.out.println(super.length);

        // this refers to this class object
        System.out.println(this.length);
    }

    // final methods cannot be overridden
//    @Override
//    public void printSizeDetails() {
//
//    }


    @Override
    public boolean equals(Object o) {
        // 1. Cast argument object to your type
        Book argBook = (Book) o;

        // 2. Compare them
        return author.equals(argBook.author)
                && title.equals(argBook.title)
                && pages == argBook.pages;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() + pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

}
