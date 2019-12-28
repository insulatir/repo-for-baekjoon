import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += count(i);
		}
		
		System.out.println(res);
		
		scan.close();
	}

	public static int count(int n) {
		int count = 0;
		
		for (int i = 1; i < (int)Math.sqrt(n)+1; i++) {
			if (n % i == 0) {
				count += 1;
			}
		}
		
		return count;
	}
}
