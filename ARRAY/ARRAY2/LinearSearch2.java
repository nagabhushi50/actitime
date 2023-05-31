package ARRAY2;

import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("enter the values");
		for (int i = 0; i < size; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the key element");
		int key=s.nextInt();
		int count=0;
		 for (int i = 0; i < a.length; i++) {
			if(a[i]==key)
			{
				count++;
				break;
			}
		}
		 if(count==1)
		 {
			 System.out.println(key + "is found");
		 }
		 else
			 System.out.println(key + "is not found");

	}

}
