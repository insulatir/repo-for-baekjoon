import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int min = 1000000;
			int max = -1000000;
			for (int j = 0; j < N; j++) {
				int n = scan.nextInt();
				if (min > n) {
					min = n;
				}
				if (max < n) {
					max = n;
				}
			}
			
			System.out.println(min + " " + max);
		}
		
		scan.close();
	}

}
