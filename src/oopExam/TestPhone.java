package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		Iphone1 iphone1 = new Iphone1();
		
		iphone1.setInfo("Iphone 1");
		iphone1.setPrice(750);
		iphone1.setUser('M');
		iphone1.setMadeInUSA(false);

		System.out.println("I bought this " + iphone1.getInfo() + " in 2000" + "\nThe price was: $" + iphone1.getPrice()
				+ "\nUser's Sex: " + iphone1.getUser() + "\nIs the phone made in USA? " + iphone1.isMadeInUSA());

		Iphone2 iphone2 = new Iphone2();

		Iphone2 iphone2Para = new Iphone2('M');
		iphone2.iPhone2Info();
		iphone2.iPhone2Info('M');
		iphone2.regularClassInfo();

		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iPhone3Map();
		iphone6.appleWatchInfo();
		iphone6.AppleWatchSeries5info();
		iphone6.regularClassInfo();
		iphone6.wireless();
		iphone6.b();
		iphone6.materials();
		iphone6.materials(100);
		iphone6.materials(100, 200);
		iphone6.materials(100, 200, "300");
		iphone6.materials(10, 20, 30, 40);
		Iphone6.materials(1, 2, 3, 4, 5);

		Iphone1 iphone01 = new Iphone1();
		AppleWatch appleWatch = new Iphone1();
		Phone phone = new Iphone1();

		iphone01.abstractClassInfo();
		iphone01.appleWatchInfo();
		iphone01.AppleWatchSeries5info();
		iphone01.b();
		iphone01.call();
		iphone01.camera();
		iphone01.pagerMethod();
		iphone01.regularClassInfo();
		iphone01.message();
		iphone01.youtube();
		iphone01.wireless();

		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.AppleWatchSeries5info();

		phone.b();
		phone.call();
		phone.camera();
		phone.interfaceInfo();
		phone.message();
		phone.pagerMethod();
		phone.wireless();

		ConfiguredIphone6 ci6 = new ConfiguredIphone6();
		ci6.materials();
		ci6.materials(10);
		ci6.materials(100, 50);
		ci6.materials(500, 200, "50");
		// Static and final method can not override

		/*
		 * -Iphone 6 to Iphone 3 is multi-level inheritance -Iphone 2 and Iphone 3
		 * inherited to Iphone 1 is hierarchical inheritance -Iphone 2 inherited Iphone
		 * 1 is single inheritance
		 */
	}

}
