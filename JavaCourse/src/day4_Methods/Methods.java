package day4_Methods;

public class Methods {
	
	static void f(int x) {
		x = 1;
	}
	
	static void someFunction(int a[]) {
		a[3] = 5;
		int helperArray[] = a;
		helperArray[2] = 123;
		
		String prviString = "123";
		String drugiString = prviString;
		
		String drugiString2 = "123";
		
		String objString = new String("123");
		
	}

	public static void main(String[] args) {		

		// example of passing parameters by value
		// the value is not changed even if we are
		// trying to change it in the 'f' method
		
//		int a = 0;
//		f(a);
//		System.out.println(a);
		
		
		// passing array as method parameter
		// note that original array 'arr'
		// will be affected after 'someFunction' method
		// is called
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		someFunction(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	int add(int a, int b) {
		//return a + b;
		int sum = a + b;
		return sum;
	}
	
	
	// method returns double value
	double getRandomNumber() {
		return Math.random() * 100;
	}
	
	
	// method doesn't return anything
	void printHelloWorld() {
		System.out.println("Hello World!");
	}
	
	// method with parameters
	int subtract(int x, int y) {
		return x - y;
	}
	
	// method with multiple return statements
	int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	
	// method and local variables in the body
	int multiply(int x, int y) {
		
		// local variable result
		int result;
		result = x * y;
		
		// return statement
		return result;
	}
	

	 
	void varNumberOfParams(int... params) {
		int x = params[0];
	}
	
	



}
