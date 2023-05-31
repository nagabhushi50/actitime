import java.util.Arrays;

public class P9 {

	public static void main(String[] args) {
		double[]a= {10.12,4.5,73.56,8.4635,8,524.3};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
