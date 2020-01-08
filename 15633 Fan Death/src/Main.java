import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int res = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				res += i;
			}
		}
		
		System.out.print(res*5-24);
		
		scan.close();
	}

}
