import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N+i; j++) {
				if (j < N-1-i || j > N-1+i) {
					System.out.print(" ");
				} else if ((j-N+1+i) % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scan.close();
	}

}
