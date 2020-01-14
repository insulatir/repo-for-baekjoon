import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int safe = 1;
		int broken = k;
		for (int i = 0; i < n; i++) {
			int floor = scan.nextInt();
			String what = scan.next();
			if (what.equals("SAFE")) {
				if (safe < floor) {
					safe = floor;
				}
			} else {
				if (broken > floor) {
					broken = floor;
				}
			}
		}
		
		System.out.print(safe + 1 + " " + (broken - 1));
		
		scan.close();
	}

}
