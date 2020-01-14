import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int W = scan.nextInt();
		int N = scan.nextInt();
		int P = scan.nextInt();
		int res = 0;
		for (int i = 0; i < P; i++) {
			int H = scan.nextInt();
			if (H >= W && H <= N) {
				res += 1;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
