import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		int R = scan.nextInt();
		int A = scan.nextInt();
		
		if (L < R) {
			A = A + L - R;
			if (A < 0) {
				L = A + R;
			} else {
				L = R;
			}
		} else if (L > R) {
			A = A + R - L;
			if (A < 0) {
				R = A + L;
			} else {
				R = L;
			}
		}
		
		if (L == R) {
			L += A / 2;
			R = L;
			System.out.print(L + R);
		} else {
			System.out.print((int)2*Math.min(L, R));
		}
		
		
		scan.close();
	}

}
