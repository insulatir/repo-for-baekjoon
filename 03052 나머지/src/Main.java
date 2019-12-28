import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[42];
		for (int i = 0; i < 10; i++) { 
			arr[scan.nextInt() % 42] += 1;
		}
		
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				res += 1;
			}
		}
		
		System.out.println(res);
		
		scan.close();
	}

}
