import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String oper = scan.next();
		String B = scan.next();
		
		if (oper.equals("*")) {
			System.out.print(1);
			
			int lenOf0 = A.length() + B.length() - 2;
			for (int i = 0; i < lenOf0; i++) {
				System.out.print(0);
			}
		} else {
			if (A.length() == B.length()) {
				System.out.print(2);
				
				for (int i = 0; i < A.length()-1; i++) {
					System.out.print(0);
				}
			} else {
				System.out.print(1);
				
				int lenOfmin = Math.min(A.length(), B.length());
				int lenOfmax = Math.max(A.length(), B.length());
				
				for (int i = 0; i < lenOfmax-lenOfmin-1; i++) {
					System.out.print(0);
				}
				
				System.out.print(1);
				
				for (int i = 0; i < lenOfmin-1; i++) {
					System.out.print(0);
				}
			}
		}
		
		scan.close();
	}

}
