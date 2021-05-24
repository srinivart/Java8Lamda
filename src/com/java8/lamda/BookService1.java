package com.java8.lamda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BookService1 {

	public List<Book> getBooksinSort() {

		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o2.getName().compareTo(o1.getName());
			}

		});

		return books;
	}
	
	
public static void main(String[] args) {
	
	
	System.out.println(new BookService().getBooksinSort().toString());
	
}	
}





/*


in fist case we created seperate , one seperate class for comparator


in second approach, we write the anonymous implementation of comparator




--> get the list of books

--> call the collections.sort() and pass the books list & new comparator

    i.e:  Collections.sort(books,new Comparator<Book>()



-->  ovveride the unimplemented method

         @Override
			public int compare(Book o1, Book o2) {

			}




--> write the compare logic inside the override method

i.e: return o2.getName().compareTo(o1.getName());
				
				
				
	

--> still we don't want this approach, we want to represent 

   logic in lamda expression
   
   
   
   
				
				



*/