import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int N = scan.nextInt();
		int res = X * (N + 1);
		for (int i = 0; i < N; i++) {
			res -= scan.nextInt();
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
