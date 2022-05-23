package day8_OOP2_Exercise2;

public class Book {

	private String name;
	private double price;
	private int yearPublished;
	private Author author;
	
	public Book() {
		
	}

	public Book(String name, double price, int yearPublished, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.yearPublished = yearPublished;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s - %s (%d) [%f RSD]", this.author.getFirstName(),
														this.author.getLastName(), 
														this.name, 
														this.yearPublished, 
														this.price);
	}
	
	
}
