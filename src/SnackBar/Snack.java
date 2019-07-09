package SnackBar;

public class Snack{
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
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public int getCost(){
		return cost;
	}
	
	public void setCost(int cost){
		this.cost = cost;
	}
	
	public int getVending(){
		return vendingId;
	}
	
	public void setVending(int vendingId){
		this.vendingId = vendingId;
	}
}

