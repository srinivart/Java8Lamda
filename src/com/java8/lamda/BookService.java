package com.java8.lamda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new MyComparator());
		return books;
	}

	
	
public static void main(String[] args) {
	
	
	System.out.println(new BookService().getBooksinSort().toString());
	
}	
	
	
	
	
	class MyComparator implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			  return o1.getName().compareTo(o2.getName());  // Assending order
			// return o2.getName().compareTo(o1.getName());     // descending order
		} 
		

	}

}



/*

Now write service method , which returns the list of books based on the sorting order



--> write list of books return type.. with method name
-->    create the object of the DAO   .. new BookDAO

---> and call the getBooks()... it gives the list of books

      it give without any order
      
---> and assign it to List<Book>


--->  we want to sort this books with using ..with name we are going to sort



---> so what we can do is..

 we need to go for the comparator
 
 as we are going to use custom sorting ..
 
 
 for that we can write one class
 
 
 
 
 clas MyComparator 
 
 
 --> implements from Comparator<Book>{}
 
 generic book
 
 --> ovverride the compare method
 
 --> then write the logic for our sorting



Under development --->
------------->

public class BookService {

	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
	}

	class MyComparator implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {

			return 0;
		}

	}

}
-------------------->



--> as we are going to sort based on the name






-------------------->
	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
	}

	class MyComparator implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

}
-------------------->








--> we need to pass it to 

Collections.sort()

sort is overloaded method, with argument as List.
select list with comparator

and then pass the object of Mycomparator


i.e: 

Collections.sort(books, new MyComparator());









Traditional approach
-------------------------->


public class BookService {

	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new MyComparator());
		return books;
	}

	class MyComparator implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

}
-------------------------->






--> lets create a main method





o/p: 
---
Book [id=101, name=Core Java, pages=400], Book [id=363, name=Hibernate, pages=180], Book [id=275, name=Spring, pages=200], Book [id=893, name=WebService, pages=300]]




[ Book [id=101, name=Core Java, pages=400], 
  Book [id=363, name=Hibernate, pages=180], 
  Book [id=275, name=Spring, pages=200], 
  Book [id=893, name=WebService, pages=300]
 
 ]





case2: 
-------

[   Book [id=893, name=WebService, pages=300], 
    Book [id=275, name=Spring, pages=200], 
    Book [id=363, name=Hibernate, pages=180], 
    Book [id=101, name=Core Java, pages=400]
    
  ]




*/