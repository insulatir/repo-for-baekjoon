import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		
		if (a + b == c) {
			System.out.print((int)a + "+" + (int)b + "=" + (int)c);
			return;
		} else if (a - b == c) {
			System.out.print((int)a + "-" + (int)b + "=" + (int)c);
			return;
		} else if (a * b == c) {
			System.out.print((int)a + "*" + (int)b + "=" + (int)c);
			return;
		} else if (a / b == c) {
			System.out.print((int)a + "/" + (int)b + "=" + (int)c);
			return;
		} else if (a == b + c) {
			System.out.print((int)a + "=" + (int)b + "+" + (int)c);
			return;
		} else if (a == b - c) {
			System.out.print((int)a + "=" + (int)b + "-" + (int)c);
			return;
		} else if (a == b * c) {
			System.out.print((int)a + "=" + (int)b + "*" + (int)c);
			return;
		} else if (a == b / c) {
			System.out.print((int)a + "=" + (int)b + "/" + (int)c);
			return;
		} 

		
		scan.close();
	}

}
