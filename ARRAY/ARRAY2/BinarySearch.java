package ARRAY2;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {200,120,180,160,140};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int key=180;
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			if(a[mid]==key)
			{
				System.out.println(key+" is found");
			break;
			}
			else if(a[mid]>key)
				high=mid-1;
			else
				low=mid+1;
			
			mid=(low+high)/2;
		}
		if(low>high)
			System.out.println(key +" is not found");
		

	}

}
