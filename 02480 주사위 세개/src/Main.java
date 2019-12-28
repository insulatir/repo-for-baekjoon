import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a == b && b == c) {
			System.out.println(a * 1000 + 10000);
		} else if (a == b || a == c) {
			System.out.println(a * 100 + 1000);
		} else if (b == c) {
			System.out.println(b * 100 + 1000);
		} else {
			System.out.println(Math.max(Math.max(a, b), c) * 100);
		}
		
		scan.close();
	}

}
