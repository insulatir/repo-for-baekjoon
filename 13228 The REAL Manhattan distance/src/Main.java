import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x1, y1, f1, x2, y2, f2 = 0;
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			f1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			f2 = scan.nextInt();
			
			System.out.println(f1 + f2 + Math.abs(x2 - x1) + Math.abs(y2 - y1));
		}
		
		scan.close();
	}

}
