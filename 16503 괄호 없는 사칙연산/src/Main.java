import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int K1 = scan.nextInt();
		String O1 = scan.next();
		int K2 = scan.nextInt();
		String O2 = scan.next();
		int K3 = scan.nextInt();
		
		int res1 = 0;
		int res2 = 0;
		
		res1 = getResult(getResult(K1, K2, O1), K3, O2);
		res2 = getResult(K1, getResult(K2, K3, O2), O1);
		
		System.out.println(res1 < res2 ? res1 : res2);
		System.out.print(res1 < res2 ? res2 : res1);
		
		scan.close();
	}

	public static int getResult(int k1, int k2, String o) {
		int res = 0;
		
		switch (o) {
		case "+":
			res = k1 + k2;
			break;
		case "-":
			res = k1 - k2;
			break;
		case "*":
			res = k1 * k2;
			break;
		case "/":
			int minus = 1;
			if (k1 < 0) {
				k1 = -k1;
				minus *= -1;
			} 
			if (k2 < 0) {
				k2 = -k2;
				minus *= -1;
			}
			res = k1 / k2 * minus;
			break;
		}
		
		return res;
	}
}
