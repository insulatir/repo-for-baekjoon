import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int joi = 0;
		int ioi = 0;
		for (int i = 0; i < s.length()-2; i++) {
			char c0 = s.charAt(i);
			char c1 = s.charAt(i+1);
			char c2 = s.charAt(i+2);
			if (c0 == 'J') {
				if (c1 == 'O' && c2 == 'I') {
					joi += 1;
				}
			} else if (c0 == 'I') {
				if (c1 == 'O' && c2 == 'I') {
					ioi += 1;
				}
			}
		}
		
		System.out.println(joi);
		System.out.print(ioi);
		
		scan.close();
	}

}
