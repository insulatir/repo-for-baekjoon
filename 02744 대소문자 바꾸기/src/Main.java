import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String rev = ch + "";
			if (Character.isLowerCase(ch)) {
				System.out.print(rev.toUpperCase());
			} else {
				System.out.print(rev.toLowerCase());
			}
		}
		
		scan.close();
	}

}
