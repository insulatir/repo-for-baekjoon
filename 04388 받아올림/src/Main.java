import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String B = scan.next();
		while (!(A.equals("0") && B.equals("0"))) {
			int a = 0;
			int b = 0;
			int c = 0;
			int res = 0;
			int max = A.length() < B.length() ? 1 : 0;
			if (max == 1) {
				for (int i = Math.max(A.length(), B.length())-1; i >= 0; i--) {
					if (i >= B.length() - A.length()) {
						a = Integer.parseInt(A.substring(i - (B.length() - A.length()), i - (B.length() - A.length()) + 1));
					}
					
					b = Integer.parseInt(B.substring(i, i+1));
					
					if (a + b + c > 9) {
						c = 1;
						res += 1;
					}
				}
			} else {
				for (int i = Math.max(A.length(), B.length())-1; i >= 0; i--) {
					if (i >= A.length() - B.length()) {
						b = Integer.parseInt(B.substring(i - (A.length() - B.length()), i - (A.length() - B.length()) + 1));
					}
					
					a = Integer.parseInt(A.substring(i, i+1));
					
					if (a + b + c > 9) {
						c = 1;
						res += 1;
					}
				}
			}
			
			System.out.println(res);
			
			A = scan.next();
			B = scan.next();
		}
		
		scan.close();
	}

}
