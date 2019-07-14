package SnackBar;

public class Customer{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;
	// private double spend;
	public Customer (String name, double cash){
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}
	public	int getId (){
		return id;
	}
	public 	String getName (){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	public  double getCash (){
		return cash;
	}
	public void  setCash (double cash){
		this.cash = cash;
	}
	public double setSpend(double cash){
		double spend = this.cash - cash;
		return spend;
	}

	@Override
	public String toString(){
		String returnStr = "name: "+name+"\n"+ "cash on hand: "+cash;
		return returnStr;
	}
	// +"\n"+"spend: "+ spend
}