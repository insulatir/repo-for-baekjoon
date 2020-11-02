import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt();
		int n = scan.nextInt();
		int[] A = new int[n];
		boolean[] W = new boolean[w+1];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		
		boolean sol = false;
		loop:
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (w - A[i] - A[j] < 0) {
					continue;
				}
				
				// w - three - four가 존재하는가
				if (W[w-A[i]-A[j]]) {
					sol = true;
					break loop;
				}
			}
			
			for (int j = 0; j < i; j++) {
				if (A[i] + A[j] < w) {
					// one + two 존재
					W[A[i]+A[j]] = true;
				}
			}
		}
		
		System.out.println(sol ? "YES" : "NO");
		
		scan.close();
	}

}
