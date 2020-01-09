import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.println("Scenario #" + i + ":");
			BigInteger n = scan.nextBigInteger();
			BigInteger m = scan.nextBigInteger();
			BigInteger ns = n.subtract(new BigInteger("1"))
					.multiply(n).divide(new BigInteger("2"));
			BigInteger ms = m.multiply(m.add(new BigInteger("1")))
					.divide(new BigInteger("2"));
			System.out.println(ms.subtract(ns));
			System.out.println();
		}
		
		scan.close();
	}

}
