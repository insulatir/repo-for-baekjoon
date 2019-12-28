import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int remain = M - N;
		for (int i = 0; i < N; i++) {
			remain -= scan.nextInt();
		}
		
		if (remain < 0) {
			System.out.println(0);
		} else {
			int p = remain / (N + 1) + 1;
			int q = remain % (N + 1);
			
			int result = p * p * q + (p - 1) * (p - 1) * (N + 1 - q);
			
			System.out.println(result);
		}
		
		scan.close();
	}

}
