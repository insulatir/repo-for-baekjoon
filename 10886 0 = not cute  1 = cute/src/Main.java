import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		for (int i = 0; i < N; i++) {
			if (scan.nextInt() == 1) {
				res += 1;
			}
		}
		
		System.out.println(res > N - res ? "Junhee is cute!" : "Junhee is not cute!");
		
		scan.close();
	}

}
