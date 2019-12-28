import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();
		int C = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		for (int i = 0; i < R * A; i++) {
			if ((i / A) % 2 == 0) {
				for (int j = 0; j < C * B; j++) {
					System.out.print((j / B) % 2 == 0 ? "X" : ".");
				}
			} else {
				for (int j = 0; j < C * B; j++) {
					System.out.print((j / B) % 2 == 0 ? "." : "X");
				}
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}
