import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			long res = 0;
			for (int j = 0; j < N; j++) {
				int max = 0;
				for (int k = 0; k < 3; k++) {
					int money = scan.nextInt();
					if (max < money) {
						max = money;
					}
				}
				res += max;
			}
			System.out.println(res);
		}
		
		scan.close();
	}

}
