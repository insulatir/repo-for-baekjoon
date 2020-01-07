import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int first = 100;
		int second = 100;
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a < b) {
				first -= b;
			} else if (a > b) {
				second -= a;
			} 
		}
		
		System.out.println(first);
		System.out.println(second);
		
		scan.close();
	}

}
