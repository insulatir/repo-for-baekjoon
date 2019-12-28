import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(z(N, r, c));
		
		scan.close();
	}

	public static int z(int N, int r, int c) {
		if (N == 0) {
			return 0;
		}
		
		int N1 = (int) Math.pow(4, N-1);
		int N2 = (int) Math.pow(2, N-1);
		
		return N1 * (2 * (r / N2) + (c / N2))
				+ z(N-1, r % N2, c % N2);
	}
}
