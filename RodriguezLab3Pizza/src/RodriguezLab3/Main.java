package RodriguezLab3;

public class Main {

	public static void main(String[] args) {
		// create a PizzaOrder object and store it in a refrence variable called order 1
		PizzaOrder order1; // declaration of the reference variable called order 1;
		order1 = new PizzaOrder();

		order1.addPizza(new Pizza(PizzaSize.LARGE, 1, 1, 0));
		order1.addPizza(new Pizza(PizzaSize.SMALL, 1, 0, 0));
		order1.printOrder();

		PizzaOrder order2;
		order2 = new PizzaOrder();

		order2.addPizza(new Pizza(PizzaSize.SMALL, 1, 2, 3));
		order2.addPizza(new Pizza(PizzaSize.MEDIUM, 3, 2, 1));
		order2.addPizza(new Pizza(PizzaSize.LARGE, 2, 5, 2));
		order2.printOrder();

		PizzaOrder order3 = order2;
		order3.printOrder();
		
		System.out.println(" Order Changes");
		System.out.println(" Change to order 1");
		order1.changePizzaToppings(3, 3, 3, 3);
		order1.printOrder();
		
		System.out.println(" Change to order 2/3");
		order2.changePizzaToppings(10, 10, 10, 10);
		order2.printOrder();
		order3.printOrder();
		
		
	}

}
