import java.util.Iterator;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of all the elements"+sum);
		int avg=sum/size;
		System.out.println("The avereage of all the elemts"+avg);
			
		}
	}