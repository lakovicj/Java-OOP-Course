package day3_Arrays;

public class JavaArrays {

	public static void main(String[] args) {

		// we can declare array variable first
		// and then intialize it
		// declaration:
		int[] myIntArray;	// or int myIntArray[];
		
		
		// allocate memory for 3 integers:
		myIntArray = new int[3];
		
		// initialize data:
		myIntArray[0] = 10;
		myIntArray[1] = 20;
		myIntArray[2] = 30;
		
		
		// if we know what elements we are going to have in the array,
		// we can instantiate array like this
		int[] intArr = new int[] {1,2,3};
		
		// or we can exclude new int[] in newer versions of Java
		int intArr2[] = {1, 2, 3};
		
		// Let's create array of 5 int elements
		// and try to set sixth element of array
		// remember that indexing starts at 0 instead of 1
		// 1st element has index=0
		// 2nd element has index=1
		// etc..
		int[] intArr3 = new int[5];
		
		// we'll get exception: ArrayIndexOutOfBoundException
		// intArr3[5] = 5;
		
		
		// accessing array elements
		System.out.println("First element: " + myIntArray[0]);
		System.out.println("Second element: " + myIntArray[1]);
		System.out.println("Third element: " + myIntArray[2]);
		
		// same exception -> ArrayIndexOutOfBoundException
		// System.out.println("Fourth element?: " + myIntArray[3]);
		
		
		// Multidimensional arrays
		
		int[][] twoDimensionalArray = new int[3][3];
		
		int[][] twoD = {{1, 2, 3, 4}, {5, 6, 7}};
		System.out.println(twoD[0][0]);
		System.out.println(twoD[0][1]);
		System.out.println(twoD[0][2]);
		System.out.println(twoD[0][3]);
		System.out.println(twoD[1][0]);
		System.out.println(twoD[1][1]);
		System.out.println(twoD[1][2]);
		
		// this will cause an error
		// twoD[1][3] = 8;
		// System.out.println(twoD[1][3]);
		
		// we didn't specify number of columns
		// we'll add columns dynamically
		int[][] customArray = new int[3][];
		
		for (int i = 0; i < customArray.length; i++) {
			customArray[i] = new int[i + 1];
			for (int j = 0; j < customArray[i].length; j++) {
				customArray[i][j] = i * 10 + j;
			}
		}
		
		// write that array to console:
		for (int i = 0; i < customArray.length; i++) {
			String row = "";
			for (int j = 0; j < customArray[i].length; j++) {
				row += customArray[i][j] + " ";
			}
			System.out.println(row);
		}
		
		
		
		
		
		
	}

}
