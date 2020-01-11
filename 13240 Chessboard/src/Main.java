import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print((i+j)%2==0?"*":".");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
