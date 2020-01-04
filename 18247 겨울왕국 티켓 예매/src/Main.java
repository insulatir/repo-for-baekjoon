import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			if (N < 12 || M < 4) {
				System.out.println(-1);
			} else {
				System.out.println(11 * M + 4);
			}
		}
		
		scan.close();
	}

}
