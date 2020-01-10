import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		long res = 1;
		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			res = (res * (a % M)) % M;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
