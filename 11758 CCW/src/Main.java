import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		
		System.out.println(ccw(x1, x2, x3, y1, y2, y3));
		
		scan.close();
	}

	public static int ccw(int x1, int x2, int x3, int y1, int y2, int y3) {
		int op = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
		if (op > 0) {
			return 1;
		} else if (op == 0) {
			return 0;
		} else {
			return -1;
		}
	}
}
