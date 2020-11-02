import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a == b && b == c) {
			System.out.print(2);
		} else if (a * a == b * b + c * c) {
			System.out.print(1);
		} else if (b * b == a * a + c * c) {
			System.out.print(1);
		} else if (c * c == a * a + b * b) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		
		scan.close();
	}

}
