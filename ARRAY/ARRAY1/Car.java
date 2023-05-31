package ARRAY1;

public class Car implements Comparable{

		double price;
		String brand;
		int now;
		
		Car(){}
		public Car(double price, String brand, int now) {
			super();
			this.price = price;
			this.brand = brand;
			this.now = now;
		}
		
		public void dd() {
			System.out.println("Price of car is :"+price);
			System.out.println("Brand og car is :"+brand);
			System.out.println("the number of wheels is :"+now);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		}
		@Override
		public String toString() {
			return price+":"+brand;
		}

		@Override
		public int compareTo(Object o) {
			Car c1=(Car)o;
			if (this.price>c1.price) {
				return 1;
			}
			else if(this.price<c1.price)
				return -1;
			else
			return 0;
		}
		
}
