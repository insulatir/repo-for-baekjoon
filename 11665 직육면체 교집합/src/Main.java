import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int x1 = 0;
		int x2 = 1000;
		int y1 = 0;
		int y2 = 1000;
		int z1 = 0;
		int z2 = 1000;
		
		for (int i = 0; i < N; i++) {
			x1 = Math.max(x1, scan.nextInt());
			y1 = Math.max(y1, scan.nextInt());
			z1 = Math.max(z1, scan.nextInt());
			x2 = Math.min(x2, scan.nextInt());
			y2 = Math.min(y2, scan.nextInt());
			z2 = Math.min(z2, scan.nextInt());
		}
		
		int x = x2 - x1;
		int y = y2 - y1;
		int z = z2 - z1;
		
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (z < 0) {
			z = 0;
		}
		
		System.out.print(x * y * z);
		
		scan.close();
	}

}
