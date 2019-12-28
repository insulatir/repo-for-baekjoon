import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double m = 0;
		for (int i = 0; i < N; i++) {
			int Q = scan.nextInt();
			
			int one = Q % 10;
			if (one == 0 || one == 6) {
				Q = Q - one + 9;
			}
			
			int ten = Q / 10;
			if (ten == 6) {
				Q = Q + (9 - ten) * 10;
			}
			
			if (Q > 100) {
				Q = 100;
			}
			
			m += Q;
		}
		
		System.out.println(Math.round(m / (N * 1.0)));
		
		scan.close();
	}

}
