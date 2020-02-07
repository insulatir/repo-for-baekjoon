import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] count = new int[50001];
		
		for (int i = 1; i <= n; i++) {
			int min = 4;
			for (int j = 1; j*j <= i; j++) {
				int c = count[i-j*j] + 1;
				if (min > c) {
					min = c;
				}
			}
			count[i] = min;
		}
		
		System.out.print(count[n]);
		
		scan.close();
	}

}
