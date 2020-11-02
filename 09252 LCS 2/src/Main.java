import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String B = scan.next();
		
		// A[n] == B[k] : (n, k) = (n-1, k-1) + 1
		// A[n] != B[k] : (n, k) = max((n-1, k), (n, k-1))
		int[][] table = new int[A.length()+1][B.length()+1];
		for (int n = 1; n <= A.length(); n++) {
			for (int k = 1; k <= B.length(); k++) {
				if (A.charAt(n-1) == B.charAt(k-1)) {
					table[n][k] = table[n-1][k-1] + 1;
				} else {
					table[n][k] = Math.max(table[n-1][k], table[n][k-1]);
				}
			}
		}
		
		int len = table[A.length()][B.length()];
		
		System.out.print(len);
		
		String lcs = "";
		loop:
		for (int n = A.length(); n > 0; n--) {
			for (int k = B.length(); k > 0; k--) {
				if (A.charAt(n-1) == B.charAt(k-1) && table[n][k] == len) {
					lcs = A.charAt(n-1) + lcs;
					len -= 1;
					continue loop;
				}
			}
		}
		
		if (table[A.length()][B.length()] > 0) {
			System.out.print("\n" + lcs);
		}
		
		scan.close();
	}

}
