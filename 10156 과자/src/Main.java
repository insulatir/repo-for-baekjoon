import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int res = K * N - M;
		if (res < 0) {
			res = 0;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
