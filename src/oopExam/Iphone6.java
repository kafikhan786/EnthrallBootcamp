package oopExam;

//IPhone 1 to IPhone 6 related by inheritance. 
public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Compass was one of the best feature in iPhone 6");

	}

	/*
	 * Method Overloading: -multiple method can have same method name with different
	 * signature/ parameters Method Overriding: -child class can provide a new
	 * implementation of a method
	 * 
	 */

	public void materials() {
		System.out.println("void type method");
	}

	public void materials(int a) {
		System.out.println("Void type parameterized method:" + a);

	}

	public void materials(int ramPrice, int cameraPrice) {
		int totalCost = ramPrice + cameraPrice;
		System.out.println(totalCost);

	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice) {

		int totalCost1 = ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println(totalCost1);
		return totalCost1;

	}

	public final int materials(int ramPrice, int cameraPrice, int processorPrice, int monitorPrice) {
		int totalCost2 = ramPrice + cameraPrice + processorPrice + monitorPrice;
		System.out.println("Final return type parameterized method: " + totalCost2);

		return totalCost2;

	}

	public static int materials(int ramPrice, int cameraPrice, int processorPrice, int monitorPrice, int mousePrice) {
		int totalCost3 = ramPrice + cameraPrice + processorPrice + monitorPrice + mousePrice;
		System.out.println("Final return type parameterized method: " + totalCost3);

		return totalCost3;

	}
}
