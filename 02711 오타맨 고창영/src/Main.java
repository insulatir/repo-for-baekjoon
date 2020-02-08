import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int miss = scan.nextInt();
			String s = scan.next();
			for (int j = 0; j < s.length(); j++) {
				if (j+1 != miss) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
		scan.close();
	}

}
