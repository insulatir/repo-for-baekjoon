import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger[] cache = new BigInteger[3];
		cache[1] = new BigInteger("1");
		cache[2] = new BigInteger("1");
		int n = scan.nextInt();

		for (int i = 3; i <= n; i++) {
			BigInteger n1 = cache[1];
			BigInteger n2 = cache[2];
			cache[0] = n1;
			cache[1] = n2;
			cache[2] = cache[0].add(cache[1]);
		}

		System.out.println(cache[2]);
		
		scan.close();
	}

}
