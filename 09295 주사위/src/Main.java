import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case " + i + ": " + (a+b));
		}
		
		scan.close();
	}

}
