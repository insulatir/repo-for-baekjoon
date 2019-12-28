import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double a = Math.max(x, y);
		double b = Math.min(x, y);
		
		int res = (int) a;
		
		for (int i = 1; i < b; i++) {
			double n = (a * (double) i) / b;
			
			if (isDouble(n)) {
				res += 1;
			}
		}
		
		System.out.println(res);
		
		scan.close();
	}

	public static boolean isDouble(double n) {
		return n - (long) n != 0;
	}
}
