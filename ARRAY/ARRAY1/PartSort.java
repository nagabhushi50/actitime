package ARRAY1;

import java.util.Arrays;

public class PartSort {

	public static void main(String[] args) {
		int[]a= {40,30,50,80,90,70,10,100,60,20};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sorting first 3 elements");
		Arrays.sort(a, 0, 2);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sorting from 3rd element to last 3 elements");
		Arrays.sort(a, 2, a.length-3);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sorting last 3 elements");
		Arrays.sort(a, a.length-3, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sorting second half");
		Arrays.sort(a, a.length/2, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sorting first half");
		Arrays.sort(a, 0, a.length/2);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
