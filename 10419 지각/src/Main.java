import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.print(late(scan.nextInt()));
			if (i < T-1) {
				System.out.println();
			}
		}
		
		scan.close();
	}

	public static int late(int d) {
		int t = 0;
		while (t + t*t <= d) {
			t += 1;
		}
		
		return t-1;
	}
}
