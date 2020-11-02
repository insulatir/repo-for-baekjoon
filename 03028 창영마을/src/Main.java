import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int ball = 1;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				if (ball == 1) {
					ball = 2;
				} else if (ball == 2) {
					ball = 1;
				}
				break;
			case 'B':
				if (ball == 2) {
					ball = 3;
				} else if (ball == 3) {
					ball = 2;
				}
				break;
			case 'C':
				if (ball == 1) {
					ball = 3;
				} else if (ball == 3) {
					ball = 1;
				}
				break;
				
			}
		}
		
		System.out.print(ball);

		scan.close();
	}

}
