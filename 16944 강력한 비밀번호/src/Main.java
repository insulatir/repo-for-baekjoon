import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String S = scan.next();
		boolean r1 = false;
		boolean r2 = false;
		boolean r3 = false;
		boolean r4 = false;
		
		for (int i = 0; i < N; i++) {
			char ith = S.charAt(i);
			if ((int)ith >= 48 && (int)ith < 58) {
				r1 = true;
			} else if ((int)ith >= 97 && (int)ith < 123) {
				r2 = true;
			} else if ((int)ith >= 65 && (int)ith < 91) {
				r3 = true;
			} else {
				r4 = true;
			}
		}
		
		int added = N;
		if (!r1) {
			added += 1;
		}
		if (!r2) {
			added += 1;
		}
		if (!r3) {
			added += 1;
		}
		if (!r4) {
			added += 1;
		}
		
		if (added < 6) {
			added = 6;
		}
		
		System.out.print(added-N);
		
		scan.close();
	}

}
