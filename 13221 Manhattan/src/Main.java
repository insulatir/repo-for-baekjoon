import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int N = scan.nextInt();
		int mintx = 0;
		int minty = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int tx = scan.nextInt();
			int ty = scan.nextInt();
			int dis = Math.abs(tx - x) + Math.abs(ty - y);
			if (min > dis) {
				min = dis;
				mintx = tx;
				minty = ty;
			}
		}
		
		System.out.print(mintx + " " + minty);
		
		scan.close();
	}

}
