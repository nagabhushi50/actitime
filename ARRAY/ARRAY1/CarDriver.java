package ARRAY1;

import java.util.Arrays;

public class CarDriver {

	public static void main(String[] args) {
		Car[]c=new Car[4];
		c[0]=new Car(200000,"Maruthi",4);
		c[1]=new Car(40000000,"Tata",4);
		c[2]=new Car(80000,"Kia",4);
		c[3]=new Car(100000,"Toyota",4);
		
		System.out.println("before sortng");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("after sorting");
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
	}

}
