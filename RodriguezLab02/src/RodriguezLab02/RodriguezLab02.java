package RodriguezLab02;

public class RodriguezLab02 {

	public static void main(String[] args) {

		// Creating three hot dog stand objects with unique names
		HotDogStand stand1 = new HotDogStand("Denver ");
		HotDogStand stand2 = new HotDogStand("Eagle  ");
		HotDogStand stand3 = new HotDogStand("Vail   ");

		// The following for loops test the justSold method to add sales and test the
		// just sold parameter method

		// Stand 1 sales
		for (int i = 0; i < Math.random() * 30; i++) {
			stand1.justSold();
		}
		stand1.justSold((int) Math.random() * 10);

		// Stand 2 sales
		for (int i = 0; i < Math.random() * 30; i++) {
			stand2.justSold();
		}
		stand2.justSold((int) Math.random() * 10);

		// Stand 3 sales
		for (int i = 0; i < Math.random() * 30; i++) {
			stand3.justSold();
		}
		stand3.justSold((int) Math.random() * 10);

		// Displaying and testing the getter methods ordered by string name, id, and
		// Individual object sales

		System.out.println("Stand name   Stand ID   Number Sold");
		System.out.println("***********************************");
		System.out.println(stand1.getName() + "         " + stand1.getID() + "         " + stand1.getSales());
		System.out.println(stand2.getName() + "         " + stand2.getID() + "         " + stand2.getSales());
		System.out.println(stand3.getName() + "         " + stand3.getID() + "         " + stand3.getSales());
		System.out.println("Total sold = " + HotDogStand.getTotalSales()); /// Displaying the total sales among all
																			/// objects
	}

}
