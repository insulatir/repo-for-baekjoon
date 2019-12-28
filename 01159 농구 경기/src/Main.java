import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] count = new int[26];
		for (int i = 0; i < N; i++) {
			count[(int)scan.next().charAt(0) - 97] += 1;
		}
		
		boolean ok = false;
		for (int i = 0; i < 26; i++) {
			 if (count[i] >= 5) {
				 ok = true;
				 System.out.print((char) (i+97));
			 }
		}
		
		if (!ok) {
			System.out.print("PREDAJA");
		}
		
		scan.close();
	}

}
