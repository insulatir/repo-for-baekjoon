import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int N = scan.nextInt();
			int S1 = N * (N+1) / 2;
			int S2 = N * N;
			int S3 = N * (N+1);
			System.out.println(S1 + " " + S2 + " " + S3);
		}
		
		scan.close();
	}

}
