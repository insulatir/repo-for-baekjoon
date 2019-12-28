import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] town = new int[n];
		for (int i = 0; i < n; i++) {
			town[i] = scan.nextInt();
		}
		
		Arrays.sort(town);
		
		int cost = 0;
		for (int i = 0; i < n-1; i++) {
			cost += town[i];
		}
		
		System.out.println(cost);
		
		scan.close();
	}

}
