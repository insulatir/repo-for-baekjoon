import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] seq = new int[N];
		int res = 0;
		for (int i = 0; i < N; i++) {
			seq[i] = scan.nextInt();
		}
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				int a = seq[i];
				int b = seq[j];
				if (a + b == K) {
					res += 1;
				}
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
