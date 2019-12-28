import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		for (int i = 0; i < 5; i++) {
			if (N == scan.nextInt()) {
				res += 1;
			}
		}
		
		System.out.println(res);
		
		scan.close();
	}

}
