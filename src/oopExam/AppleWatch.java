package oopExam;

/*
-keyword "abstract" is mandatory while declaring an abstract class in Java.
-Abstract classes cannot be instantiated directly.
-abstract class can include non-abstract methods.
-abstract class can be extends to or from a regular class
-abstract class can implements interface
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String name;

	public AppleWatch() {

	}

	/*
	 * -Yes, we can create a variable and constructor inside Abstract Class -but it
	 * can not be instantiated
	 */
	public void abstractClassInfo() {
		System.out.println(
				"Feature of an Abstract class: \nkeyword abstract is mandatory while declaring an abstract class in Java.\n"
						+ "-Abstract classes cannot be instantiated directly.\n"
						+ "-abstract class can include non-abstract methods.\n"
						+ "-abstract class can be extends to or from a regular class\n"
						+ "-abstract class can implements interface");
	}

	public void appleWatchInfo() {

	}

}
