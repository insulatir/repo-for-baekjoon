import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int N = scan.nextInt();
		
		int res = 0;
		loop:
		for (int i = 0; i * A <= N; i++) {
			for (int j = 0; j * B <= N; j++) {
				for (int k = 0; k * C <= N; k++) {
					if (i * A + j * B + k * C == N) {
						res = 1;
						break loop;
					}
				}
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
