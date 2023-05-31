import java.util.Arrays;

public class P7 {

	public static void main(String[] args) {
		int[]a= {10,45,7356,84635,8,5243};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("the largest numer is "+a[a.length-1]);
		System.out.println("the second largest number is "+a[a.length-2]);

	}

}
