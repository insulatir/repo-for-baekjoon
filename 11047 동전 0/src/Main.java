import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int count = 0;
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}

		for (int i = N-1; i >= 0; i--) {
			int coin = A[i];
			count += K / coin;
			K = K % coin;
		}
		
		System.out.println(count);
		
		scan.close();
	}

}
