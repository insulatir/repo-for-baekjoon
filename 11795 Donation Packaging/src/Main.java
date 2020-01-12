import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int A = 0;
		int B = 0;
		int C = 0;
		for (int i = 0; i < T; i++) {
			A += scan.nextInt();
			B += scan.nextInt();
			C += scan.nextInt();
			if (A >= 30 && B >= 30 && C >= 30) {
				int packages = Math.min(A, Math.min(B, C));
				System.out.println(packages);
				A -= packages;
				B -= packages;
				C -= packages;
			} else {
				System.out.println("NO");
			}
		}
		
		scan.close();
	}

}
