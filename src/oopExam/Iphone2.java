package oopExam;

//extends Iphone1 as parents class
public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'M';

	public Iphone2() {

		super();
		System.out.println("Default constructor from iPhone2");

	}

	public Iphone2(char userOfIphone2) {
		super(1000, "Rakib", 'M', true);

		this.userOfIphone2 = userOfIphone2;
		System.out.println("Gender of Iphone 2: " + userOfIphone2);
	}

	public void iPhone2Info() {
		// called variable by super keyword and assigned value
		super.myName = "Rakibur Khan";

		super.setInfo("Rakib");
		super.setPrice(1000);
		super.setUser('M');
		super.setMadeInUSA(true);
		super.getInfo();
		super.getPrice();
		super.getUser();
		super.isMadeInUSA();

		System.out.println("My Name: " + myName);
		System.out.println("This iPhone user info is: " + getInfo() + "\nPhone price is: " + getPrice()
				+ "\nUser Gender: " + getUser() + "\nIs the phone made in USA? " + isMadeInUSA());

	}

	public void iPhone2Info(char userOfIphone2) {
		System.out.println("Gender of Iphone 2: " + userOfIphone2);
	}

	public void dropbox() {
		System.out.println("dropbox is a goot feature from IPhone 2");
	}

}
