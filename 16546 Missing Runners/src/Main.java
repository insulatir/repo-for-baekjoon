import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long res = N * (N + 1) / 2;
		for (long i = 0; i < N-1; i++) {
			res -= scan.nextLong();
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
