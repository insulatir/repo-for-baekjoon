import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int k = scan.nextInt();
		int res = 0;
		for (int i = 0; i <= k; i++) {
			res += N;
			N *= 10;
		}
		System.out.print(res);
		
		scan.close();
	}

}
