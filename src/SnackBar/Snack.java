package SnackBar;

public class Snack{
	private static int low = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingId;
	
	public Snack(int quantity, String name,double cost, int vendingId){
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;

	}
	
	public int getId(){
		return id;
	}

	public void setName(int id){
		this.id = id;
	}
	//name
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//quantity
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	//cost
	public double getCost(){
		return cost;
	}
	public void setCost(double cost){
		this.cost = cost;
	}
	//vending
	public int getVending(){
		return vendingId;
	}
	public void setVending(int vendingId){
		this.vendingId = vendingId;
	}
//buy
	public double setBuy(int newquantity){
	 	double price = this.cost * newquantity;
	 	return price;
	}

	public void setAdd(int quantity){
		this.quantity += quantity;
	}
	public double getTotal(){
		return cost*quantity;
	}

	public String toString(){
		String rtnStr =  "quantity: " + quantity +"\n"+"name: "+name+ "\n"+ "cost: "+ cost+ "\n"+"vendingId: "+vendingId;
		return rtnStr;
	}

}

