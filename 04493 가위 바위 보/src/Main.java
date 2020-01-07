import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int one = 0;
			int two = 0;
			for (int j = 0; j < n; j++) {
				String a = scan.next();
				String b = scan.next();
				if (a.equals("R")) {
					if (b.equals("P")) {
						two += 1;
					} else if (b.equals("S")) {
						one += 1;
					}
				} else if (a.equals("P")) {
					if (b.equals("R")) {
						one += 1;
					} else if (b.equals("S")) {
						two += 1;
					}
				} else {
					if (b.equals("R")) {
						two += 1;
					} else if (b.equals("P")) {
						one += 1;
					}
				}
			}
			System.out.println(one<two?"Player 2":one>two?"Player 1":"TIE");
		}
		
		scan.close();
	}

}
