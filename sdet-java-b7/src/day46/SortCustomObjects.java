package day46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCustomObjects {
	public static void main(String[] args) {
		Book[] books = {
				new Book("OCA", 500),
				new Book("OCP", 600),
				new Book("Java", 550),
				new Book("Algorithms", 800)
		};
		System.out.println(books[0]);
		System.out.println(Arrays.toString(books));
		System.out.println(books);
		// How do you sort array in Java?	
		// Arrays.sort();
		
		// for customer object we need to have extra setup because Java doesn't know
		// which property to use for sorting
		// If we want to sort custom object by using java libraries we need to implement
		// Comparable interface
		
		Arrays.sort(books);
		System.out.println(Arrays.toString(books));
		System.out.println("----");
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("JS", 700));
		bookList.add(new Book("Python", 620));
		bookList.add(new Book("Go", 900));
		bookList.add(new Book("Ruby", 460));
		bookList.add(new Book("Java", 100));
		
		System.out.println(bookList);
		Collections.sort(bookList);
		System.out.println(bookList);
		
	}
}

class Book implements Comparable<Book> {
	public String title;
	public int numberOfPages;
	
	public Book(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "{title=" + title + ", numberOfPages=" + numberOfPages + "}";
	}
	
	@Override
	public int compareTo(Book other) {
		if (other == null) {
			return -1;
		}
		
		// return this.title.compareTo(other.title);
		if (this.numberOfPages < other.numberOfPages) {
			return -1;
		} else if (this.numberOfPages > other.numberOfPages) {
			return 1;
		}
		
		return 0;
	}
}
	