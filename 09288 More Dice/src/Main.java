import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println("Case " + i + ":");
			int sum = scan.nextInt();
			for (int j = 1; j <= sum/2; j++) {
				if (sum-j <= 6) {
					System.out.println("(" + j + "," + (sum-j) + ")");
				}
			}
		}
		
		scan.close();
	}

}
