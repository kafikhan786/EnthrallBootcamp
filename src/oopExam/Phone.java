package oopExam;

/*Features of interface
 -interface is a reference type
 -can contain method signature, default and static method
 -can use extends keywords to inherit more than one interface
 -can not inherit regular or abstract class
 -can not use implement keyword
 -can not have method void or return method body 
 */
/*
 -Extends Pager and Wakitoki interface to Phone interface
 -can not inherit regular class or abstract class to interface
 */

public interface Phone extends Pager, Wakitoki {

	public int age = 10;

	/*
	 * Interface can not have Constructor
	 */

	public abstract void interfaceInfo();

	public abstract void call();

	public abstract void message();

	public abstract void camera();

	public default void b() {

	}

	public static void battery() {
		System.out.println("Battery is a static void method from Java Interface");
	}

	public default void wireless() {
		System.out.println("Wireless is a default void method from Java Interface");
	}

}
