import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt();
			BigInteger sum = new BigInteger("0");
			for (int j = 0; j < n; j++) {
				sum = sum.add(scan.nextBigInteger());
			}
			System.out.println(sum.divideAndRemainder(
					new BigInteger(n+""))[1].equals(
							new BigInteger("0"))?"YES":"NO");
		}
		
		scan.close();
	}

}
