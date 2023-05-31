package ARRAY2;

public class LinearSearch {

	public static void main(String[] args) {
		int[]a= {30,40,30,100,80,60,90};
		int key=50;
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key)
			{
				c++;
				break;
			}
		}
		if(c==1)
		{
			System.out.println(key +" is found in array");
		}
		else
			System.out.println(key+ " is not found");

	}

}
