import java.util.Arrays;

public class P8 {

	public static void main(String[] args) {
		char[]a= {'a','A','R','z','N','s'};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//it will arrange based on ASCII values
		Arrays.sort(a);
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
