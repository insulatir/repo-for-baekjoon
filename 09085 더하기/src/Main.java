import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int res = 0;
			for (int j = 0; j < N; j++) {
				res += scan.nextInt();
			}
			System.out.println(res);
		}
		
		scan.close();
	}

}
