import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger n = scan.nextBigInteger();
		
		BigInteger result = n.multiply(n.subtract(BigInteger.valueOf(1))).multiply(n.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
		
		System.out.print(result);
		
		scan.close();
	}

}
