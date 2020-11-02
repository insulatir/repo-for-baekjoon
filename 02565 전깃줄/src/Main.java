import java.util.*;
public class Main {
	public static class vector implements Comparable<vector>{
		int a;
		int b;
		
		public vector(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public int compareTo(vector v) {
			if (this.a < v.a) {
				return -1;
			} else if (this.a > v.a) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		vector[] arr = new vector[n];
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[i] = new vector(a, b);
		}
 		
		Arrays.sort(arr);
		
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			if (dp[i] == 0) {
				dp[i] = 1;
			}
			
			for (int j = 0; j < i; j++) {
				if (arr[j].b < arr[i].b && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		Arrays.sort(dp);
		
		System.out.print(n-dp[n-1]);
				
		scan.close();
	}

}
