import java.util.Iterator;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		int evensum=0;
		int oddsum=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0)
			{
				evensum=evensum+a[i];
			}
			else
				oddsum=oddsum+a[i];
		}
		System.out.println("the even sum is "+evensum);
		System.out.println("the odd sum id "+oddsum);
	}
}