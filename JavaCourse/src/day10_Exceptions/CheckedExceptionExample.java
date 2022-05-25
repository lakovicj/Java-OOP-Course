package day10_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		File f = new File("/Users/jovanlakovic/Desktop/dataa.txt");
		FileInputStream fis = null;
		
		// warning about possible FileNotFoundException
		// fis = new FileInputStream(f);
		
		// so we are gonna need to wrap it in try-catch
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			
			// this is printed in red font in the console
			// the whole stack trace of occured exception
			e.printStackTrace();
		}
		
	}
}
