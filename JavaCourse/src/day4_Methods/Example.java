package day4_Methods;

public class Example {

	public static void main(String[] args) {
		
		
		String x = "123";
		String y = "123";
		
		String z = new String("123");
		
		
		System.out.println(x == y);
		
		System.out.println(x == z);
		
		String original = "original text";
		String originalCopy = original;
		
		System.out.println("original: " + original);
		System.out.println("original copy: " + originalCopy);
		
		original = "asdasd";
		
		System.out.println("original: " + original);
		System.out.println("original copy: " + originalCopy);
		
		originalCopy = "123123";
		
		System.out.println("original: " + original);
		System.out.println("original copy: " + originalCopy);
		
		
		
//		changeString(original);
		
		System.out.println(original);
		
		
		
	}
	
	public static void changeString(String stringParam) {
		stringParam = "changed text";
		String second = stringParam;
		
	}

}
