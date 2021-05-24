package com.java8;


interface Calculator {

	void switchOn();
}

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator cal = () -> System.out.println("Swithc On");
			
		cal.switchOn();

	}

}




/*

--> first create CalculatorImpl clas

inside add one interface


now add abstract method in it.


void switchOn();


for the above abstract method we are going to write lamda expression



--> we know that lamda expression is nothing but 
converting this traditional abastract method to anonymous method using lamda expression



Lets write lamda expression for switchOn() method





--> first we should know the syntax of lamda expression



      ()      ->    {method body};
      
      
      parameter expression methodbody
      
       
       
       
       
       
 CAse : 1   
-------------------------------------------->       
     interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl {


    public static void main(String[] args) {
		
	}

}  
       
       
-------------------------------------------->  








in our traditional approach what we do is 


--> first implement from the interface

--> then we override the method


--> then we create the main method 


--> and with the reference of the parent or child 
    we invoke the method by providing the implementation
    
    
 



 CAse : 2   
--------------------------------------------> 

interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl implements Calculator {

	@Override
	public void switchOn() {
      System.out.println("Switch On");
		
	}
	
	public static void main(String[] args) {
		
	}

}
--------------------------------------------> 



--------------------------------------------> 
 Traditional way calling the method using reference
--------------------------------------------> 
interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl implements Calculator {

	@Override
	public void switchOn() {
      System.out.println("Swithc On");
		
	}
	
	public static void main(String[] args) {
	
	      // Calculator cal = new CalculatorImpl();
		 //CalculatorImpl cal = new CalculatorImpl();

		
		//Calculator cal = new Calculator();    // Cannot instantiate the type Calculator
		//CalculatorImpl cal = new Calculator();  // ype mismatch: cannot convert from Calculator to CalculatorImpl
		
		CalculatorImpl cal = new CalculatorImpl();
		cal.switchOn();
	}

}

--------------------------------------------> 


--------------------------------------------> 
interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl implements Calculator {

	@Override
	public void switchOn() {
      System.out.println("Swithc On");
		
	}
	
	public static void main(String[] args) {
		
		CalculatorImpl cal = new CalculatorImpl();
		cal.switchOn();
	}

}
--------------------------------------------> 















the above  is Traditional approach

but we are not interested in that approach





---> first lets copy the method switchOn() inside main method




--------------------------------------------> 
sample
--------------------------------------------> 
interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl implements Calculator {


	
	public static void main(String[] args) {
		
		public void switchOn() {
		      System.out.println("Swithc On");
				
			}
		
	}

}
--------------------------------------------> 





--> we are going to write the anonymous function with lamdda expression



--> remove the implementation

implements Calculator 

   we can remove that, we don't need to write if that contaions only one method
   
  





--> so we don't need the method name or prefix, so remove those

    public void switchOn



--------------------------------------------> 
() {
		      System.out.println("Switch On");
				
			}
--------------------------------------------> 		
			
--> we have parameter and body, what else we need is

			
			only lamda expression
			

--> add that 


--------------------------------------------> 
() -> {
		      System.out.println("Switch On");
				
			}
--------------------------------------------> 


--> add semicolon after parantesis


--------------------------------------------> 
() -> {
		      System.out.println("Switch On");
				
			};
--------------------------------------------> 




--------------------------------------------> 
sample
--------------------------------------------> 

interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl {



	public static void main(String[] args) {
		
		() -> {
		      System.out.println("Swithc On");
				
			};
		
	}

}
--------------------------------------------> 




---> the above one gives the compilation error 
so we need to assign it to the corresponding interface







--------------------------------------------> 
interface Calculator{
	
	void switchOn();
}


public class CalculatorImpl {



	public static void main(String[] args) {
		
		Calculator cal = () -> {
		      System.out.println("Swithc On");
				
			};
		
	}

}
--------------------------------------------> 




---> to cal the method ,

   reference of the interfae, then call the method swithch on
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 --------------------------------------------> 
  Traditional Approach
--------------------------------------------> 

interface Calculator {

	void switchOn();
}

public class CalculatorImpl implements Calculator {

	@Override
	public void switchOn() {
		System.out.println("Swithc On");

	}

	public static void main(String[] args) {

		CalculatorImpl cal = new CalculatorImpl();
		cal.switchOn();
	}

}
   
  
--------------------------------------------> 
  Final 
--------------------------------------------> 

interface Calculator {

	void switchOn();
}

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator cal = () -> {
			System.out.println("Swithc On");

		};

		cal.switchOn();

	}

}
--------------------------------------------> 
















--------------------------------------------> 
Errors 
--------------------------------------------> 
interface Calculator {

	void switchOn();
}

public class CalculatorImpl {


	public static void main(String[] args) {

		CalculatorImpl cal = () -> {
			System.out.println("Swithc On");
		
	      };
		cal.switchOn();
       
}

}
--------------------------------------------> 


-->
The target type of this expression must be a functional interface

we get the error, 
here we should assign the lamda expression to interface reference 


as below 
------>
Calculator cal = () -> {
			System.out.println("Swithc On");

		};

















--------------------------------------------> 
Final 
--------------------------------------------> 
interface Calculator {

	void switchOn();
}

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator cal = () -> {
			System.out.println("Swithc On");

		};
		cal.switchOn();

	}

}
--------------------------------------------> 





--> we can still optiomize this 

becuase it has only one statement, we don't need paranthesis & semicolon






-------------------------------------------->
interface Calculator {

	void switchOn();
}

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator cal = () -> System.out.println("Switch On");
			
		cal.switchOn();

	}

}

-------------------------------------------->





if only one statement is there, and that too print statement

then we can ignore the paranthesis











-------------------------------------------->
Calculator cal = () -> System.out.println("Switch On");

-------------------------------------------->


here i




if you observe here, it has only one line code





but if we go for traditional approach

-->  we need to implement 
--> we need to ovveride
--> then provide the business
--> then create the object 
--> then call the mehtod.





so the advantage of lamda expression is to reduce the 

 code length..
 
 
 
 
 
 
 
 here as we have only one method , no argument method
 
 we can easily write the lamda syntax..
 
 --->
 Lets play with some others method, with arguments , with return types.
 
 
 
 




*/