import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		for (int i = 1; i*i < N; i++) {
			if (N % i == 0 && (i + N / i) % 2 == 0) {
				res += 1;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}
}
