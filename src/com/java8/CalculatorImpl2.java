package com.java8;

interface Calculator2 {

	int add(int i1, int i2);
}

public class CalculatorImpl2 {

	public static void main(String[] args) {

		Calculator2 cal = (i1, i2) -> i1 + i2;

		System.out.println("sum: " + cal.add(5, 4));
	}

}






/*
 
 
 
 
 Before 
----------------------------->
interface Calculator2 {

	int add(int i1,int i2);
}

public class CalculatorImpl2 {

	public static void main(String[] args) {

		
	}

}
----------------------------->





if we have business logic,
we want to perform  some operations, with the inputs 

we must need to use the


for this we are going to write lamda expression







--> copy the method into main

--> remove the method name & return type

--> remove the data type inside the bracket (int i1, int i2)


---> add lamda expression between    () -> {}

---> add semicolon at end

--> if only one statement remvoe the braces

---> assign it to the Interface reference( corresponding interface


---> call the method with that reference

--> and pass the arguments.



--> as it the method with return type, we need to provide the return type in the braces






----------------------------->
Calculator2 cal = (i1, i2) -> {
			return i1+i2;
		};
		
		
----------------------------->

		
		
		
Lets call this method

use the reference to call the method and pass the arguments


	
		
		
----------------------------->
Final method		
----------------------------->
	interface Calculator2 {

	int add(int i1,int i2);
}

public class CalculatorImpl2 {

	public static void main(String[] args) {

		
		Calculator2 cal = (i1, i2) -> {
			return i1+i2;
		};
		
		System.out.println("sum: "+ cal.add(5, 4));
	}

}	
----------------------------->		
		
		
		
		


	
		
		
----------------------------->		
		Calculator2 cal = (i1, i2) -> {
			return i1+i2;
		};	
		
----------------------------->	
		
		
		
	---> we can optimize the above
it still has one line statement, we don't need brackets

		
--> as we are going to return with one line	
		
	we don't need return statement as well
	
		
--> remove paranthesis and semicolon




		
----------------------------->		
		Calculator2 cal = (i1, i2) -> i1+i2;
		
----------------------------->		
		
		
		
		
		
		
		
		
		
		
		
		
----------------------------->	
Simplified
----------------------------->			
interface Calculator2 {

	int add(int i1, int i2);
}

public class CalculatorImpl2 {

	public static void main(String[] args) {

		Calculator2 cal = (i1, i2) -> i1 + i2;

		System.out.println("sum: " + cal.add(5, 4));
	}

}
		
----------------------------->			
		







if we have some busineess logic, if you want perform some logic
with the input values that you are passing
you must need to use the curly braces











*/