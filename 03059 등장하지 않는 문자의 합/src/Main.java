import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			String S = scan.next();
			int[] check = new int[26];
			for (int j = 0; j < S.length(); j++) {
				check[S.charAt(j) - 'A'] += 1;
			}
			
			int sol = 0;
			for (int j = 0; j < 26; j++) {
				if (check[j] == 0) {
					sol += j + 65;
				}
			}
			
			System.out.println(sol);
		}
		
		scan.close();
	}

}
