import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int sball = 1;
		int bball = 4;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				if (sball == 1) {
					sball = 2;
				} else if (sball == 2) {
					sball = 1;
				}
				if (bball == 1) {
					bball = 2;
				} else if (bball == 2) {
					bball = 1;
				}
				break;
			case 'B':
				if (sball == 1) {
					sball = 3;
				} else if (sball == 3) {
					sball = 1;
				}
				if (bball == 1) {
					bball = 3;
				} else if (bball == 3) {
					bball = 1;
				}
				break;
			case 'C':
				if (sball == 1) {
					sball = 4;
				} else if (sball == 4) {
					sball = 1;
				}
				if (bball == 1) {
					bball = 4;
				} else if (bball == 4) {
					bball = 1;
				}
				break;
			case 'D':
				if (sball == 2) {
					sball = 3;
				} else if (sball == 3) {
					sball = 2;
				}
				if (bball == 2) {
					bball = 3;
				} else if (bball == 3) {
					bball = 2;
				}
				break;
			case 'E':
				if (sball == 2) {
					sball = 4;
				} else if (sball == 4) {
					sball = 2;
				}
				if (bball == 2) {
					bball = 4;
				} else if (bball == 4) {
					bball = 2;
				}
				break;
			case 'F':
				if (sball == 3) {
					sball = 4;
				} else if (sball == 4) {
					sball = 3;
				}
				if (bball == 3) {
					bball = 4;
				} else if (bball == 4) {
					bball = 3;
				}
				break;
			}
		}
		
		System.out.println(sball);
		System.out.print(bball);
		
		scan.close();
	}

}
