import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int P = scan.nextInt();
		for (int i = 0; i < P; i++) {
			System.out.print(scan.next() + " ");
			int N = scan.nextInt();
			System.out.print(N * (N + 1) / 2 + " ");
			System.out.print(N * N + " ");
			System.out.println(N * (N + 1));
		}
		
		scan.close();
	}

}
