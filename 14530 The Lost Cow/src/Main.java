import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int n = 0;
		int nx = x + 1;
		int dis = 0;
		while (true) {
			if (n % 2 == 0) {
				if (x <= y && y <= nx) {
					dis += y - x;
					System.out.print(dis);
					break;
				} else {
					dis += nx - x;
				}
			} else {
				if (nx <= y && y <= x) {
					dis += x - y;
					System.out.print(dis);
					break;
				} else {
					dis += x - nx;
				}
			}
			
			n += 1;
			x = nx;
			nx += (int)Math.pow(-1, n) * 
					(Math.pow(2, n) + Math.pow(2, n-1));
		}
		
		scan.close();
	}

}
