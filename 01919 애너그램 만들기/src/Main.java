import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] counta = new int[26];
		int[] countb = new int[26];
		int res = 0;
		
		String A = scan.next();
		String B = scan.next();
		
		for (int i = 0; i < A.length(); i++) {
			counta[(int)A.charAt(i)-97] += 1;
		}
		for (int i = 0; i < B.length(); i++) {
			countb[(int)B.charAt(i)-97] += 1;
		}
		
		for (int i = 0; i < 26; i++) {
			res += Math.min(counta[i], countb[i]);
		}
		
		System.out.println(A.length() + B.length() - res*2);
		
		scan.close();
	}

}
