import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String B = scan.next();
		long a = 0;
		long b = 0;
		
		for (int i = 0; i < A.length(); i++) {
			a += Long.parseLong(A.substring(i, i+1));
		}
		for (int i = 0; i < B.length(); i++) {
			b += Long.parseLong(B.substring(i, i+1));
		}
		
		long res = a * b;
		System.out.print(res);
		
		scan.close();
	}

}
