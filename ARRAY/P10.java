import java.util.Arrays;

public class P10 {

	public static void main(String[] args) {
		String[]a= {"Naga","Bhushan","pramod","prasad","chandru","Surya","arya"};
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
