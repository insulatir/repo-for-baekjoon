import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int i = 1;
		while (a*b*c != 0) {
			System.out.println("Triangle #" + i);
			double l = 0;
			if (a == -1) {
				l = Math.sqrt(c*c-b*b);
				System.out.println(l > 0 ? "a = " + String.format("%.3f", l) : "Impossible.");
			} else if (b == -1) {
				l = Math.sqrt(c*c-a*a);
				System.out.println(l > 0 ? "b = " + String.format("%.3f", l) : "Impossible.");
			} else {
				l = Math.sqrt(a*a+b*b);
				System.out.println(l > 0 ? "c = " + String.format("%.3f", l) : "Impossible.");
			}
			System.out.println();

			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			i += 1;
		}
		
		scan.close();
	}

}
