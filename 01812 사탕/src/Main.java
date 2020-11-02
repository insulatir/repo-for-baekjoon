import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int sum = 0;
		int[] candy_sum = new int[N];
		for (int i = 0; i < N; i++) {
			candy_sum[i] = scan.nextInt();
			sum += candy_sum[i];
		}
		
		sum /= 2;
		
		int one = sum;
		for (int i = 1; 2*i < N; i++) {
			one -= candy_sum[2*i-1];
		}
		
		int[] candy = new int[N];
		candy[0] = one;
		for (int i = 1; i < N; i++) {
			candy[i] = candy_sum[i-1] - candy[i-1];
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(candy[i]);
			if (i < N-1) {
				System.out.println();
			}
		}
		
		scan.close();
	}

}
