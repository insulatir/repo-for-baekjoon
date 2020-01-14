import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int s = scan.nextInt();
		int[] sol = new int[n];
		for (int i = 0; i < n; i++) {
			sol[i] = scan.nextInt();
		}
		
		Arrays.sort(sol);
		
		int mil = sol[n-1] * s;
		int sec = (mil - 1) / 1000 + 1;
		System.out.print(sec);
		
		scan.close();
	}

}
