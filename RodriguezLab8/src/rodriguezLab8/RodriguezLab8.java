package rodriguezLab8;

public class RodriguezLab8 {

	public static void main(String[] args) {

		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		Apple apple = new Macintosh();

		// 2.
		// Code for verification here

		System.out.println("\nIs the object fruit an instance of Fruit? ");
		System.out.println(fruit instanceof Fruit);

		System.out.println("\nIs the object fruit an instance of Orange? ");
		System.out.println(fruit instanceof Orange);

		System.out.println("\nIs the object fruit an instance of Apple? ");
		System.out.println(fruit instanceof Apple);

		System.out.println("\nIs the object fruit an instance of GoldenDelicious? ");
		System.out.println(fruit instanceof GoldenDelicious);

		System.out.println("\nIs the object fruit an instance of Macintosh? ");
		System.out.println(fruit instanceof Macintosh);

		System.out.println("\nIs the object orange an instance of Orange? ");
		System.out.println(orange instanceof Orange);

		System.out.println("\nIs the object orange an instance of Fruit? ");
		System.out.println(orange instanceof Fruit);

		System.out.println("\nIs the object apple an instance of Fruit? ");
		System.out.println(apple instanceof Fruit);

		System.out.println("\nIs the object apple an instance of GoldenDelicious? ");
		System.out.println(apple instanceof GoldenDelicious);

		// 3.
		// Code for verification here

		System.out.println("\nSuppose the method makeAppleCider() is defined only in the Apple class");
		System.out.println("\nCan fruit invoke this method? ");

		// No because the handle is incorrect. the var type is Fruit therfore can only
		// get Fruit methods
		// fruit.makeAppleCider(); <-- Does not work

		System.out.println("\nCan apple invoke this method? Yes");
		apple.makeAppleCider();

		System.out.println("\nSuppose I create a new variable GoldenDelicious gd = new GoldenDelicious();\n");
		GoldenDelicious gd = new GoldenDelicious();
		System.out.println("Then can gd invoke the makeAppleCider method? Yes");
		gd.makeAppleCider();

		// 5.
		// Code for verification here
		System.out.println(
				"\nNow suppose the method makeAppleCider() is defined in the Apple, GoldenDelicious, and Macintosh classes. \nIdentify the class of the method that is invoked when apple invokes the makeAppleCider() method.");
		apple.makeAppleCider();

		// 6.
		// Code for verification here
		System.out.println(
				"\nSuppose the method makeOrangeJuice() is defined in the Orange class. Can orange invoke this method?");
		orange.makeOrangeJuice();

		System.out.println(
				"Can fruit invoke this method? No because the var is of type fruit, can only use Fruit methods");
		// fruit.makeOrangeJuice();

		// 7.
		// Code for verification here
		System.out.println("\nIs the statement Orange p = new Apple(); legal? No, orange only extends Fruit");
		//Orange p = new Apple();
		
		System.out.println("\nIs the statement Macintosh p = new Apple(); legal? No, Macintosh is a child of Apple, cant upcast");
		//Macintosh p = new Apple();
		
		System.out.println("\nIs the statement Apple p = new Macintosh(); legal? Yes, Macintosh is a child of Apple, downcasting");
		Apple p = new Macintosh();
		
		System.out.println("\nIs the statement Fruit x = new Macintosh(); legal? Yes, Macintosh is a grandchild of Fruit, downcasting");
		Fruit x = new Macintosh();
		
		System.out.println("\nIs the statement GoldenDelicious g = new Fruit(); legal? No, GoldenDelicious is a grandchild of Fruit, downcasting");
		//GoldenDelicious g = new Fruit();
		
		
		

	}

}
