import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		boolean num = false;
		for (int i = 1; i < N.length(); i++) {
			int a = 1;
			int b = 1;
			
			for (int j = 0; j < i; j++) {
				a *= Integer.parseInt(N.charAt(j) + ""); 
			}
			for (int j = i; j < N.length(); j++) {
				b *= Integer.parseInt(N.charAt(j) + "");
			}
			
			if (a == b) {
				num = true;
			}
		}
		
		System.out.println(num ? "YES" : "NO");
		
		scan.close();
	}

}
