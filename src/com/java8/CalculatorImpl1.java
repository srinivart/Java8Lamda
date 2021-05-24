package com.java8;

interface Calculator1 {

	void sum(int input);
}

public class CalculatorImpl1 {

	public static void main(String[] args) {

		Calculator1 cal = (input) -> System.out.println(input);
		
		cal.sum(5);
	}

}










/*
 
 
----------------->-----------------> 
 interface Calculator1 {

	void sum(int input);
}

public class CalculatorImpl1 {

	public static void main(String[] args) {

	}

}
----------------->----------------->----------------->






Lets write teh lamdda expression for this method

----------------->
void sum(int input);
----------------->



--> convert that to lamda






----------------->


(int input){

}

----------------->




--> add lamda expression in between

--> add semicolon after paranthesis

--> add interface reference

--> if one statement remove braces and semicolon





----------------->----------------->
interface Calculator1 {

	void sum(int input);
}

public class CalculatorImpl1 {

	public static void main(String[] args) {

		Calculator1 cal = (int input) -> {
			System.out.println(input);
		};

	}

}

----------------->----------------->








------------------------------------------->
interface Calculator1 {

	void sum(int input);
}

public class CalculatorImpl1 {

	public static void main(String[] args) {

		Calculator1 cal = (int input) -> System.out.println(input);
		
		
		
	}

}
------------------------------------------->


--> to call the method use the reference and 

call the method sum() 
and pass the argument


--> check the interface, to know which method 
we can call on from that interface


cal.sum(5);



--->


------------------------------------------->
interface Calculator1 {

	void sum(int input);
}

public class CalculatorImpl1 {

	public static void main(String[] args) {

		Calculator1 cal = (int input) -> System.out.println(input);
		
		
		cal.sum(5);
	}

}
------------------------------------------->






--> we can still optimize it

we don't need to pass the data type


Before
----->
Calculator1 cal = (int input) -> System.out.println(input);
		


After
----->
Calculator1 cal = (input) -> System.out.println(input);






that will be taken care by the compiler.
which data type and what is the input







*/


