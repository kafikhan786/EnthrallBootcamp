package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	public void materials() {
		System.out.println("void type method");
	}

	public void materials(int a) {
		int b = 10;
		int total = a + b;
		System.out.println("Void type parameterized method:" + total);

	}

	public void materials(int ramPrice, int cameraPrice) {
		int totalCost = ramPrice - cameraPrice;
		System.out.println(totalCost);

	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice) {

		int totalCost1 = ramPrice + cameraPrice / Integer.parseInt(processorPrice);
		System.out.println(totalCost1);
		return totalCost1;

	}

	// Final and Static method can not override
}
