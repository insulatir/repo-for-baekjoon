import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int k = scan.nextInt();
			for (int j = 0; j < k; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
