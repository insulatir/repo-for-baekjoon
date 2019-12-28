import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String S = scan.next();
		
		int score = 0;
		int bonus = 0;
		for (int i = 1; i <= N; i++) {
			if (S.charAt(i-1) == 'O') {
				score += i;
				score += bonus;
				bonus += 1;
			} else {
				bonus = 0;
			}
		}
		
		System.out.println(score);
		
		scan.close();
	}

}
