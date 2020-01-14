import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		for (int i = 1; i <= r; i++) {
			int n = scan.nextInt();
			System.out.print("Case " + i + ": " + (n - 1));
			for (int j = n; j > 0; j--) {
				System.out.print(" " + j * scan.nextInt());
			}
			scan.next();
			System.out.println();
		}
		
		scan.close();
	}

}
