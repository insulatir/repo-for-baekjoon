import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			for (int j = 2; j <= N; j++) {
				int count = 0;
				while (N % j == 0) {
					N /= j;
					count += 1;
				}
				
				if (count > 0) {
					System.out.println(j + " " + count);
				}
			}
		}
		
		scan.close();
	}

}
