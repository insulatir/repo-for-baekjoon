import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			Stack<Character> s = new Stack<>();
			String ps = scan.next();
			for (int j = 0; j < ps.length(); j++) {
				s.add(ps.charAt(j));
			}
			
			boolean vps = true;
			
			int right = 0;
			for (int j = 0; j < ps.length(); j++) {
				char p = s.pop();
				if (p == ')') {
					right += 1;
				} else {
					if (right > 0) {
						right -= 1;
					} else {
						vps = false;
						break;
					}
				}
			}
			
			if (right > 0) {
				vps = false;
			}
			
			System.out.println(vps ? "YES" : "NO");
		}
		
		scan.close();
	}

}
