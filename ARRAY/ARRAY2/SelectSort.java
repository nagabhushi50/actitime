package ARRAY2;


public class SelectSort {

	public static void main(String[] args) {
		int[]a= {70,40,80,120,60,20,100,0};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("by using select sort algorithm");
		for (int i = 0; i < a.length-1; i++) {
			int pos=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[pos]>a[j]) {
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
