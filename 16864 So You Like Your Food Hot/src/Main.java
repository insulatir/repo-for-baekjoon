import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pt = (int)(Math.round(100 * scan.nextDouble()));
		int p1 = (int)(Math.round(100 * scan.nextDouble()));
		int p2 = (int)(Math.round(100 * scan.nextDouble()));
		
		boolean none = true;
		for (int i = 0; i <= pt / p1; i++) {
			if ((pt - i * p1) % p2 == 0) {
				none = false;
				System.out.println(i + " " + (pt - i * p1) / p2);
			}
		}
		
		if (none) {
			System.out.print("none");
		}
		
		scan.close();
	}

}
