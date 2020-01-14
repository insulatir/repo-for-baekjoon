import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		BigInteger C = scan.nextBigInteger();
		BigInteger D = scan.nextBigInteger();
		
		System.out.print((C.add(D)).divide((A.subtract(B))));
		
		scan.close();
	}

}
