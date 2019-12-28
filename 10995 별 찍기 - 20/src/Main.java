import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 2*N-1; j++) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (int j = 0; j < 2*N; j++) {
					if (j % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}
