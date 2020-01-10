import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			System.out.print("Case " + i + ": ");
			int X = scan.nextInt();
			String O = scan.next();
			int Y = scan.nextInt();
			scan.next();
			int Z = scan.nextInt();
			
			X = O.equals("+") ? X + Y : X - Y;
			System.out.println(X == Z ? "YES" : "NO");
		}
		
		scan.close();
	}

}
