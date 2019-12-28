import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (isPrime(i) && isPalin(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println(-1);
		
		scan.close();
	}

	public static boolean isPrime(int N) {
		for (int i = 2; i <= (int)Math.sqrt(N); i++) {
			if (N % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPalin(int N) {
		String n = new String(N + "");
		
		for (int i = 0; i < (n.length()+1)/2; i++) {
			if (n.charAt(i) != n.charAt(n.length()-1-i)) {
				return false;
			}
		}
		
		return true;
	}
}	
