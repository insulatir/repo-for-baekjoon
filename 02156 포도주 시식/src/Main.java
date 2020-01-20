import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] amount = new int[n];
		for (int i = 0; i < n; i++) {
			amount[i] = scan.nextInt();
		}
		
		int[][] sum = new int[n][2];
		sum[0][0] = amount[0];
		sum[1][0] = amount[1];
		sum[1][1] = amount[0] + amount[1];
		for (int i = 2; i < n; i++) {
			sum[i][0] = Math.max(sum[i-2][0], sum[i-2][1]) + amount[i];
			sum[i][1] = sum[i-1][0] + amount[i];
			if (amount[i] == 0) {
				sum[i][1] = Math.max(sum[i-1][0], sum[i-1][1]) + amount[i];
			}
		}
		
		System.out.print(Math.max(Math.max(sum[n-1][0], sum[n-1][1]), sum[n-2][1]));
		
		scan.close();
	}

}
