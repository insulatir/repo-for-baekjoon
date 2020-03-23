import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		while (num != 0) {
			String s = num + "";

			boolean p = true;
			for (int i = 0; i < s.length()/2; i++) {
				if (s.charAt(i) != s.charAt(s.length()-1-i)) {
					p = false;
					break;
				}
			}
			
			System.out.println(p ? "yes" : "no");
			
			num = scan.nextInt();
		}
		
		scan.close();
	}

}
