import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BigInteger res = new BigInteger("1");
		BigInteger gcd = new BigInteger("2");
		for (int i = 2; i <= 1000; i++) {
			gcd = gcd.gcd(new BigInteger(i+""));
		}
		for (int i = 2; i <= 1000; i++) {
			res = res.multiply(new BigInteger(i+""));
		}
		res = res.divide(gcd);
		res.subtract(new BigInteger("1"));
		System.out.print(res);
	}

}
