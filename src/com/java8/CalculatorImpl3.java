package com.java8;

interface Calculator3 {

	int sub(int i1, int i2);
}

public class CalculatorImpl3 {

	public static void main(String[] args) {

		Calculator3 cal = (i1, i2) -> {

			if (i1 < i2) {
				throw new RuntimeException("message");
			} else {
				return i1 - i2;
			}
		};

		System.out.println("sum: " + cal.sub(5, 9));
	}

}




/*











Case 1:
----------------------------->

interface Calculator3 {

	int sub(int i1, int i2);
}

public class CalculatorImpl3 {

	public static void main(String[] args) {

		Calculator3 cal = (i1, i2) ->  i1 - i2;

		System.out.println("sum: " + cal.sub(5, 4));
	}

}
----------------------------->



Case 2:
----------------------------->
interface Calculator3 {

	int sub(int i1, int i2);
}

public class CalculatorImpl3 {

	public static void main(String[] args) {

		Calculator3 cal = (i1, i2) ->  {
			return i1 - i2;
		};

		System.out.println("sum: " + cal.sub(5, 4));
	}

}
----------------------------->







if we have business logic we can use this way










Case 3:
----------------------------->
interface Calculator3 {

	int sub(int i1, int i2);
}

public class CalculatorImpl3 {

	public static void main(String[] args) {

		Calculator3 cal = (i1, i2) -> { 
			
			if(i1<i2) {
				throw new RuntimeException("message");
			}
			else {
				return i1 - i2;
			}	
		};

		System.out.println("sum: " + cal.sub(5, 4));
	}

}

----------------------------->







Case 3:
----------------------------->

interface Calculator3 {

	int sub(int i1, int i2);
}

public class CalculatorImpl3 {

	public static void main(String[] args) {

		Calculator3 cal = (i1, i2) -> {

			if (i1 < i2) {
				throw new RuntimeException("message");
			} else {
				return i1 - i2;
			}
		};

		System.out.println("sum: " + cal.sub(5, 9));
	}

}
----------------------------->

Exception in thread "main" java.lang.RuntimeException: message
	at com.java8.CalculatorImpl3.lambda$0(CalculatorImpl3.java:15)
	at com.java8.CalculatorImpl3.main(CalculatorImpl3.java:22)
	
	
	
	
	
	
	







*/