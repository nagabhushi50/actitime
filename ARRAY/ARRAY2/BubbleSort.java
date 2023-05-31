package ARRAY2;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a= {90,30,60,150,120};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("by using bubble sort algorithm");
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1])//to arrange in ascending order
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
