import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long h = scan.nextLong();
		long m = scan.nextLong();
		long s = scan.nextLong();
		long sec = h * 3600 + m * 60 + s;
		
		int tc = scan.nextInt();
		for (int i = 0; i < tc; i++) {
			int T = scan.nextInt();
			if (T == 1) {
				long c = scan.nextLong();
				sec = (sec + c) % (24 * 3600);
			} else if (T == 2) {
				long c = scan.nextLong();
				sec = (sec - c) % (24 * 3600);
			} else {
				if (sec < 0) {
					sec += 24 * 3600;
				}
				h = sec / 3600;
				m = sec % 3600 / 60;
				s = sec - h * 3600 - m * 60;
				System.out.println(h + " " + m + " " + s);
			}
		}
		
		scan.close();
	}

}
