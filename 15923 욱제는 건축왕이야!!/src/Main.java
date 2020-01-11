import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int fx = scan.nextInt();
		int fy = scan.nextInt();
		int x1 = fx;
		int y1 = fy;
		int x2 = 0;
		int y2 = 0;
		
		int len = 0;
		for (int i = 0; i < N-1; i++) {
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			len += x1 == x2 ? Math.abs(y2-y1) : Math.abs(x2-x1);
			
			x1 = x2;
			y1 = y2;
		}

		x2 = fx;
		y2 = fy;
		len += x1 == x2 ? Math.abs(y2-y1) : Math.abs(x2-x1);
		
		System.out.print(len);
		
		scan.close();
	}

}
