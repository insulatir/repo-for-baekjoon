import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int res = 0;
			
			int s = scan.nextInt();
			res += s;
			int n = scan.nextInt();
			for (int j = 0; j < n; j++) {
				int q = scan.nextInt();
				int p = scan.nextInt();
				res += q * p;
			}
			
			System.out.println(res);
		}
		
		scan.close();
	}

}
