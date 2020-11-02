import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] liquid = new int[N];
		for (int i = 0; i < N; i++) {
			liquid[i] = scan.nextInt();
		}
		
		int sum = Integer.MAX_VALUE;
		int left = 0;
		int right = N - 1;
		int a1 = 0;
		int a2 = 0;
		while (left < right) {
			if (sum > Math.abs(liquid[left] + liquid[right])) {
				sum = Math.abs(liquid[left] + liquid[right]);
				a1 = left;
				a2 = right;
			}
			
			if (liquid[left] + liquid[right] < 0) {
				left += 1;
			} else if (liquid[left] + liquid[right] > 0) {
				right -= 1;
			} else {
				break;
			}
		}
		
		System.out.print(liquid[a1] + " " + liquid[a2]);
		
		scan.close();
	}

}
