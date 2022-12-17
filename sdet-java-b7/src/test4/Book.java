package test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
    public String title;
    public int numberOfPages;

    public Book() {}

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
    
  	@Override
    public int compareTo(Book o){
      //Book book = (Boook) o;
      
     if(o == null){
       return -1;
     }
      if (this.numberOfPages < o.numberOfPages){
        return -1;
      }else if(this.numberOfPages>o.numberOfPages){
        return 1;
      }
      return 0;
  	}

}
