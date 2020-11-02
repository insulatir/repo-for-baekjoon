import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] liquid = new long[N];
		for (int i = 0; i < N; i++) {
			liquid[i] = scan.nextLong();
		}
		
		Arrays.sort(liquid);
		
		long sum = Long.MAX_VALUE;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		for (int i = 0; i < N; i++) {
			int left = i + 1;
			int right = N - 1;
			while (left < right) {
				if (sum > Math.abs(liquid[i] + liquid[left] + liquid[right])) {
					sum = Math.abs(liquid[i] + liquid[left] + liquid[right]);
					a1 = i;
					a2 = left;
					a3 = right;
				}
				
				if (liquid[i] + liquid[left] + liquid[right] < 0) {
					left += 1;
				} else if (liquid[i] + liquid[left] + liquid[right] > 0) {
					right -= 1;
				} else {
					break;
				}
			}
		}
		
		System.out.print(liquid[a1] + " " + liquid[a2] + " " + liquid[a3]);
		
		scan.close();
	}

}
