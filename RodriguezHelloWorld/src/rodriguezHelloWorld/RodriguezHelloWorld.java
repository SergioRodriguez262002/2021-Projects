/* Author: Sergio Rodriguez
 * Hello world in a new workspace in intro 2*/
package rodriguezHelloWorld;

public class RodriguezHelloWorld {

	public static void main(String[] args) {
		StaticVersusInstancePractice obj1 = new StaticVersusInstancePractice();
		StaticVersusInstancePractice obj2 = new StaticVersusInstancePractice(5);
		
		for (int i = 0; i < 10; i++) {
			obj1.grow(5);
			obj2.grow();
		}
		System.out.println(obj1.getv1());
		System.out.println(obj1.getv2());
		System.out.println(obj2.getv1());
		System.out.println(obj2.getv2());
	}

}
