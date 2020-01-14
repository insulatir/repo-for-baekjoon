import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int T = scan.nextInt();
		int flag = (T - 2) / (2 * N - 1);
		if (flag % 2 == 0) {
			System.out.print((T - 2) % (2 * N - 1) + 2);
		} else {
			System.out.print(2 * N + 1 - ((T - 2) % (2 * N - 1) + 2));
		}
			
		scan.close();
	}

}
