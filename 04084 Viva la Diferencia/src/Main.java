import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		while (a*b*c*d != 0) {
			int res = 0;
			while (!(a == b && b == c && c == d)) {
				int a1 = Math.abs(a-b);
				int b1 = Math.abs(b-c);
				int c1 = Math.abs(c-d);
				int d1 = Math.abs(d-a);
				a = a1;
				b = b1;
				c = c1;
				d = d1;
				res += 1;
			}
			
			System.out.println(res);
			
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
		}
		
		scan.close();
	}

}
