package ARRAY2;

import java.util.Scanner;

public class SelectSort2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("after sorting by selectsort algorith");
		for (int i = 0; i < a.length-1; i++) {
			int pos=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[pos]>a[j])
				{
					pos=j;
				}
			}
			if(i!=pos)
			{
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		}
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
