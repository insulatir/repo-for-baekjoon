import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String L = scan.next();
		String U = scan.next();
		long l = Long.parseLong(L);
		long u = Long.parseLong(U);
		long res = 0;
		
		res += ((long)Math.pow(10, L.length()) - l) * L.length();
		
		for (int i = L.length()+1; i < U.length(); i++) {
			res += 9 * (long)Math.pow(10, i-1) * i;
		}
		
		res += (u+1 - (long)Math.pow(10, U.length()-1)) * U.length();
		
		System.out.println(res);
		
		scan.close();
	}

}
