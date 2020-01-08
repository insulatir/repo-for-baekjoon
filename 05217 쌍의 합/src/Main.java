import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			System.out.print("Pairs for " + n + ":");
			for (int j = 1; j < (n+1)/2; j++) {
				if (j >= 2) {
					System.out.print(",");
				}
				System.out.print(" " + j + " " + (n-j));
			}
			System.out.println();
		}
		
		scan.close();
	}

}
