package com.java8.lamda;

import java.util.Collections;
import java.util.List;

public class BookService2 {

	// (o1,o2) -> o2.getName().compareTo(o1.getName())
	// pass this in collections.sort()

	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));
		return books;
	}

	public static void main(String[] args) {

		System.out.println(new BookService().getBooksinSort().toString());

	}

}





/*
 
 we want to write in lamda expression . for the method..
 
 
 
 ------------->
 public int compare(Book o1, Book o2) {
				return o2.getName().compareTo(o1.getName());
			}
 
 ----------->
 
 
 
 
 for anonymous method , we don't want any method name or prefix
 
 so remove it
 
 
 
 --> so we don't need to pass the data type of arguments
 
 
 --> we need lamda expression
 
 
 --> if body contains, one line of code , remove the curly brackets
 
 
 --> remove the return type
 
 

 
 after
------------->
 (o1,o2) -> o2.getName().compareTo(o1.getName());
 
 ------------->
 
 
 
 pass this in place of compartor in sort method
 
 
 Before
 ---->
 
 Collections.sort(books, new Comparator<Book>()
 
 
 
 
 
 
 After
 ------->
 
 Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));
 
 
 
 
 
 output
 -------
 
 [Book [id=101, name=Core Java, pages=400], Book [id=363, name=Hibernate, pages=180], Book [id=275, name=Spring, pages=200], Book [id=893, name=WebService, pages=300]]

 
 
 */
