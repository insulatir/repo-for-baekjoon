import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int two = sum2(n) - sum2(n-m) - sum2(m);
		int five = sum5(n) - sum5(n-m) - sum5(m);
		
		System.out.println((int) Math.min(two, five));
		
		scan.close();
	}

	public static int sum2(int n) {
		int res = 0;
		
		while (n > 0) {
			n = n / 2;
			res += n;
		}
		
		return res;
	}
	
	public static int sum5(int n) {
		int res = 0;
		
		while (n > 0) {
			n = n / 5;
			res += n;
		}
		
		return res;
	}
}
