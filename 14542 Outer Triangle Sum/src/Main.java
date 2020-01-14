import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i = 0;
		while (n != 0) {
			int res = 0;
			
			for (int j = 0; j < n-1; j++) {
				for (int k = 0; k <= j; k++) {
					int num = scan.nextInt();
					if (k == 0 || k == j) {
						res += num;
					}
				}
			}
			for (int j = 0; j < n; j++) {
				res += scan.nextInt();
			}
			
			i += 1;
			System.out.println("Case #" + i + ":" + res);
			n = scan.nextInt();
		}
		
		scan.close();
	}

}
