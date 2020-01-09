import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		int res = 0;
		
		int min = Math.min(X, Y);
		res += A+B < 2*C ? (A+B)*min : 2*C*min;
		X -= min;
		Y -= min;
		
		if (X == 0) {
			if (B < 2*C) {
				res += B * Y;
			} else {
				res += 2 * C * Y;
			}
		} else {
			if (A < 2*C) {
				res += A * X;
			} else {
				res += 2 * C * X;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
