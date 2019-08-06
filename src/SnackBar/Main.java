package SnackBar;

public class Main{

	public static void main(String[] args){
		Customer c1 = new Customer("jane",45.25);
		Customer c2 = new Customer("bob",33.14);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println("----vending machines----");

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");
		System.out.println(food);
		System.out.println(drink);
		System.out.println(office);

		System.out.println("----snacks-----");

		Snack s1 = new Snack(36,"chips",1.75,food.getId());
		Snack s2 = new Snack(36,"Chocolate",1.00,food.getId());
		Snack s3 = new Snack(30,"pretzel",2.00,food.getId());
		Snack s4 = new Snack(24,"soda",2.50,drink.getId());
		Snack s5 = new Snack(20,"water",2.75,drink.getId());

		System.out.println("snack-1");
		System.out.println(s1.getQuantity());
		System.out.println("snack-2");
		System.out.println(s2);
		System.out.println("snack-3");
		System.out.println(s3);
		System.out.println("snack-4");
		System.out.println(s4);
		System.out.println("snack-5");
		System.out.println(s5);

		


		System.out.println("---Process---");
		
		 System.out.println(c1.setSpend(s4.setBuy(3)));
		 System.out.println(c1.setSpend(s3.setBuy(1)));
		 System.out.println(c2.setSpend(s4.setBuy(2)));
		 System.out.println(c1.setAdd(10));
		 System.out.println(c1.setSpend(s1.setBuy(2)));
		 System.out.println(s3.setAdd(12));
		 System.out.println(c2.setSpend(s3.setBuy(3)));
	}
}