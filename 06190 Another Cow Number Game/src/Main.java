import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		while (N > 1) {
			N = N % 2 == 0 ? N / 2 : 3 * N + 1;
			res += 1;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
