package ARRAY1;

public class Laptop {
	int ramsize;
	String brand;
	double price;
	
	Laptop(){}

	public Laptop(int ramsize, String brand, double price) {
		super();
		this.ramsize = ramsize;
		this.brand = brand;
		this.price = price;
	}
	public void display()
	{
		System.out.println("ram size is : "+ramsize);
		System.out.println("The brand name is: "+brand);
		System.out.println("The price of laptop is: "+price);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ramsize+":" +brand+":"+price;
	}
	
}
