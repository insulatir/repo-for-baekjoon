import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		Arrays.sort(A);
		
		int M = scan.nextInt();
		for (int i = 0; i < M; i++) {
			
			if (i < M - 1) {
				System.out.print(" ");
			}
		}
		
		scan.close();
	}

	
}
