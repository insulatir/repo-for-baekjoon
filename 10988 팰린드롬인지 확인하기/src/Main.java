import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		boolean solution = true;
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) {
				solution = false;
				break;
			}
		}
		
		System.out.print(solution ? 1 : 0);
		
		scan.close();
	}

}
