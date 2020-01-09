import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		BigInteger C = scan.nextBigInteger();
		A = C.divideAndRemainder(new BigInteger("2"))[1] 
				.equals(new BigInteger("0")) ? A : A.xor(B);
		
		System.out.print(A);
		
		scan.close();
	}

}
