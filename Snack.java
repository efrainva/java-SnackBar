package java-SnackBar;

private class Snack{
	private static int low = 12;
	private int id;
	private String name;
	private int quantity;
	private int cost;
	private int vendingId;
	
	public Snack(int id, String name, int quantity, int cost, int vendingId){
		low++;
		id = low;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;

	}

	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String setName(String name){
		return this.name = name;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public int setQuantity(int quantity){
		return this.quantity = quantity;
	}
	
	public int getCost(){
		return cost;
	}
	
	public int setCost(int cost){
		return this.cost = cost;
	}
	
	public int getVending(){
		return vendingId;
	}
	
	public int setVending(int vendingId){
		return this.vendingId = vendingId;
	}
}

