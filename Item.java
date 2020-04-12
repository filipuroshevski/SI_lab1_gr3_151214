class Item {
	int id;
	String name;
	double price;
	
	int B =5;   //TODO add variable.

	public Item (int id, String name, double price,int B) {
		
		this.id=id;
		this.name=name;
		this.price=price;
		this.B=B;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setB(int B) {
		this.B=B;
	}
	
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public int getB() {
		return B;
	}
	public double getPrice() {
		return price;
	}
	
	double taxReturn () {
		//TODO
	}
}