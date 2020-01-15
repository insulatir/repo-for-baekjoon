import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		int B = scan.nextInt();
		int res = 0;
		for (int i = 0; i < N.length(); i++) {
			char ith = N.charAt(i);
			
			if (48 <= ith && ith < 58) {
				res += (ith - 48) * Math.pow(B, N.length()-1-i);
			} else {
				res += (ith - 55) * Math.pow(B, N.length()-1-i);
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
