import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int L = scan.nextInt();
		int[] as = new int[101];
		for (int i = 0; i < 101; i++) {
			as[i] = -1;
		}
		
		for (int i = L; i < 101; i++) {
			double a = (double) (2 * N - i * (i - 1)) / (double) (2 * i);
			if (a - (int) a == 0) {
				as[i] = (int) a;
			}
		}

		int max = Integer.MIN_VALUE;
		int len = L;
		for (int i = L; i < 101; i++) {
			if (max < as[i]) {
				max = as[i];
				len = i;
			}
		}
		
		
		if (0 <= max && L <= len && len <= 100) {
			for (int i = 0; i < len; i++) {
				System.out.print((max + i) + " ");
			}
		} else {
			System.out.print(-1);
		}
		
		scan.close();
	}

}
