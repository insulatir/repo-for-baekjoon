import java.util.*;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		String s = scan.next();
		BigInteger sum = new BigInteger("0");
		
		for (int i = 0; i < L; i++) {
			sum = sum.add(new BigInteger(
					new BigInteger((s.charAt(i)-96)+"")
					.multiply(pow(new BigInteger("31"), i)) 
					+ ""));
		}
		
		System.out.print(sum.divideAndRemainder(
				new BigInteger("1234567891"))[1]);
		
		scan.close();
	}

	public static BigInteger pow(BigInteger r, int i) {
		BigInteger res = new BigInteger("1");
		
		for (int j = 0; j < i; j++) {
			res = res.multiply(r);
		}
		
		return res;
	}
}
