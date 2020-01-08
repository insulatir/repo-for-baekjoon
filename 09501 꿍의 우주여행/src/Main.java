import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int D = scan.nextInt();
			int res = 0;
			for (int j = 0; j < N; j++) {
				double v = scan.nextDouble();
				double f = scan.nextDouble();
				double c = scan.nextDouble();
				if (v*f/c >= D) {
					res += 1;
				}
			}
			System.out.println(res);
		}
		
		scan.close();
	}

}
