package java-SnackBar;

private class VendingMachine{
	private static int maxId = 0;
	private int id;
	private String name;
	private VendingMachine(int id, String name){
		maxId++;
		id = maxId;
		this.name = name

	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
}