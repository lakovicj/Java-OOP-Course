package day8_OOP2_Exercise2;

public class Main {

	public static void main(String[] args) {

		Author author = new Author("Ivo", "Andric", "ivo@gmail.com");
		
		Book book = new Book("Na Drini Cuprija", 1050.0, 1945, author);
		
		System.out.println(book);
	}

}
