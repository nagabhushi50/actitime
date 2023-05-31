import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		//to find largest number
		int large=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("the largest number is "+large);

	}

}
