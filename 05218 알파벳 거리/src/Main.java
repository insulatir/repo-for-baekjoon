import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			String a = scan.next();
			String b = scan.next();
			System.out.print("Distances:");
			for (int j = 0; j < a.length(); j++) {
				int len = b.charAt(j) - a.charAt(j);
				len = len < 0 ? len + 26 : len;
				System.out.print(" " + len);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
