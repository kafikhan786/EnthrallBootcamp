package oopExam;

/*
-we can implements Phone and extends AppleWatch abstract class, but we have to implement unimplemented method from interface or/and abstract class. 
 */

public class Iphone1 extends AppleWatch implements Phone {

	// Private variables
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public String myName;

	// Default constructor
	public Iphone1() {
		System.out.println("Default constructor from iPhone1");
	}

	// Parameterized constructor
	public Iphone1(int price, String info, char user, boolean madeInUSA) {

		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println(
				"Price: " + price + "\nUser Name: " + info + "\nUser Gender: " + user + "Made in Usa? " + madeInUSA);
	}

	/*
	 * -if the variables are private We can use getter and setter method to access
	 * data
	 */

	// Getter and setter methods in pairs
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println(
				"Features of Regular class: \nRegular class can print something by using Main method \nConcreate class \nIt can implements multiple interfaces and extends a regular or abstract class \nRegular class can implement and declare varibales \nRegular class can have default or parameterized constructor \nRefular class can have method implemented");
	}

	public void youtube() {
		System.out.println("youtube is a goot feature from IPhone 1");
	}

	@Override
	public void pagerMethod() {
		System.out.println("This is an override method");

	}

	@Override
	public void interfaceInfo() {
		System.out.println("This is an override method");

	}

	@Override
	public void call() {
		System.out.println("This is an override method");

	}

	@Override
	public void message() {
		System.out.println("This is an override method");

	}

	@Override
	public void camera() {
		System.out.println("This is an override method");

	}

}
