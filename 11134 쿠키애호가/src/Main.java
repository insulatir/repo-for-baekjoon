import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int C = scan.nextInt();
			System.out.println((N-1)/C+1);
		}
		
		scan.close();
	}

}
