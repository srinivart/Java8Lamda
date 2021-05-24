package com.java8;

public interface MyFunctionalInterface {
	
	void m1();
		
	default void m2() {
		System.out.println("Default method");
	}
	
	default void m3() {
		System.out.println("Default method 2");
	}

	static void m4() {
		System.out.println("Static method");
	}
		
}


/*

void m1();
	
void m5();



if we add another abastracct method it will show error as 



Invalid '@FunctionalInterface' annotation; MyFunctionalInterface is not a functional interface



--> this annotation is not mandatory

@FunctionalInterface

if we want we can add or remove


-->


--> for functional interface that have abstract method
for that only we can write lamda expression




--> so we can convert that

 m1() method to lamda expression using anonnymous function using 
lamda expression


thats what we are going to do in this 







First write Functional interface with abstract method and 
then will show you how to represent in lamda expression












*/
