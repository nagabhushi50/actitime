package ARRAY1;

import java.util.Arrays;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop []l1=new Laptop[3];
		l1[0]=new Laptop(8,"Dell",39999);
		l1[1]=new Laptop(12,"HP",49999);
		l1[2]=new Laptop(6,"Lenovo",59999);
		
		System.out.println("before sorting");
		for (int i = 0; i < l1.length; i++) {
			System.out.println(l1[i]);
		}
		
		System.out.println("after sorting based on ramsize");
		Arrays.sort(l1, new SortByRam());
		for (int i = 0; i < l1.length; i++) {
			System.out.println(l1[i]);
		}
		
		System.out.println("after sorting based on price");
		Arrays.sort(l1, new SortByPrice());
		for (int i = 0; i < l1.length; i++) {
			System.out.println(l1[i]);
		}
		
		System.out.println("after sorting based on brand");
		Arrays.sort(l1, new SortByBrand());
		for (int i = 0; i < l1.length; i++) {
			System.out.println(l1[i]);
		}
	}

}
