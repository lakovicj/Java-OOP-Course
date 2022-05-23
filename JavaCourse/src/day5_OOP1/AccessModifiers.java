package day5_OOP1;

public class AccessModifiers {
	
	// default scope
	String defaultProperty;
	
	// private scope
	private String privateProperty;
	
	// public scope
	public String publicProperty;
	
	// protected scope
	protected String protectedProperty;
	
	
	public AccessModifiers() {
		System.out.println(privateProperty);
	}
	
	public String getPrivateProperty() {
		return this.privateProperty;
	}
	
	public void setPrivateProperty(String value) {
		if (value.equals("")) {
			System.out.println("You can't set it to empty string");
		} else {
			this.privateProperty = value;
		}
		
	}

}
