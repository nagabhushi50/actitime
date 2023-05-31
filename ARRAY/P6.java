import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		//to find largest number and second largest number
		int large1=a[0];
		int large2=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large1) {
				large2=large1;
				large1=a[i];
			}
			else if (a[i]>large2) {
				large2=a[i];
		}
		
		}
		System.out.println("the first largest number is "+large1);
		System.out.println("the second largest number is "+large2);

	}

}
