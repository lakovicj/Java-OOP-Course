package day2_Literals;

public class Literals {

	public static void main(String[] args) {
		
		Literals mainObj = new Literals();
		System.out.println("===== Integral Literals =====");
		mainObj.integralLiterals();
		System.out.println("===== Floating-Point Literals =====");
		mainObj.floatingPointLiterals();
		System.out.println("===== Character Literals =====");
		mainObj.characterLiterals();
		System.out.println("===== String Literals =====");
		mainObj.stringLiterals();
		System.out.println("===== Boolean Literals =====");
		mainObj.booleanLiterals();
		System.out.println("===== Bad Literal Concatenation =====");
		mainObj.poorLiteralConcatenation();

	}
	
	public void integralLiterals() {
      // decimal-form literal
      int a = 101;
      
      // octal-form literal
      int b = 0100;
      
      // Hexa-decimal form literal
      int c = 0xFace;
      
      // Binary literal
      int d = 0b1111;
     
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
	}
	
	public void floatingPointLiterals() {
      // decimal-form literal
      double a = 101.230;
      
      // It also acts as decimal literal
      double b = 0123.222;
      
      // if we want float -> add f on the end
      float c = 101.230f;
      
      // Hexa-decimal form (uncomment next line to see the error)
      // float d = 0x123.222;
     
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      //System.out.println(d);
	}
	
	public void characterLiterals() {
		
      // single character literal within single quote
      char ch = 'a';
      
      // It is an Integer literal with octal form
      char b = 0123;
      
      // Unicode representation
      char c = '\u0061';
     
      System.out.println(ch);
      System.out.println(b);
      System.out.println(c);
     
      // Escape character literal
      System.out.println("\"  is a symbol");
	}
	
	public void stringLiterals() {
		String s = "Hello";
		System.out.println(s);
	}
	
	public void booleanLiterals() {
		boolean b = true;
        boolean c = false;
        
        // this is an error
        //boolean d = 0;
        //boolean b = 1;
 
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
        //System.out.println(e);
	}
	
	public void poorLiteralConcatenation() {
		// ASCII value of 0 is 48
        int first = '0';
        // first = 48;
        System.out.println(first);
 
        // ASCII value of 7 is 55
        int second = '7';
        System.out.println("Geeks!" + first + '2' + second);
	}

}
