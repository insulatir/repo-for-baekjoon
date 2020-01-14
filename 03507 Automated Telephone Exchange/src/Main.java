import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if (0 <= n && n <= 198) {
			if (n >= 100) {
				System.out.print(199 - n);
			} else {
				System.out.print(n + 1);
			}
		} else {
			System.out.print(0);
		}
		
		scan.close();
	}

}
