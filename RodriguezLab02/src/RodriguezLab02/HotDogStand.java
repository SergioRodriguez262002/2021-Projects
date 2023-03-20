package RodriguezLab02;

public class HotDogStand {
	private String name;
	private int sales = 0;
	private int standID;

	// Static vars. These static vars track each new addition of ids and track total
	// sales among all hot dog stand objects
	private static int ID = 0;
	private static int totalSales;

	public HotDogStand(String id) { // Constructor that allocates the name to the parameter and allocates the
									// individual stand ID to the static id tracker variable
		name = id;
		ID++;
		standID = ID;
	}

	public void justSold() { // Method that increases the sale of this object by 1 and total sales by one
		this.sales++;
		totalSales++;
	}

	public void justSold(int sold) { // Method that increases sales of this object by the parameter and the static
										// total sales value by the parameter too
		this.sales += sold;
		totalSales += sold;
	}

	public String getName() { // Getter method that returns the string name of this hot dog stand object
		return this.name;
	}

	public int getID() { // Getter method that returns the int id of this hot dog stand object
		return this.standID;
	}

	public int getSales() { // Getter method returns the sales of this hot dog stand object
		return this.sales;
	}

	public static int getTotalSales() { // Static method returns the total sales of all objects combined
		return totalSales;
	}

}
