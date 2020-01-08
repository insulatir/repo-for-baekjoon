import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int next = 0;
		int res = 0;
		for (int i = 0; i < N; i++) {
			if (next == scan.nextInt()) {
				res += 1;
				next = (next+1) % 3;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
