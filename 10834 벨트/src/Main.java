import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		int c = 0;
		for (int i = 0; i < M; i++) {
			a = a.multiply(scan.nextBigInteger());
			b = b.multiply(scan.nextBigInteger());
			c += scan.nextInt();
		}
		
		System.out.print((c%2) + " " + b.divide(a));
		
		scan.close();
	}

}
