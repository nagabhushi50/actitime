import java.util.Iterator;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("the elements of an array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		

	}

}
