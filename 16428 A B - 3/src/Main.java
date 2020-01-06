import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		
		BigInteger[] dr = A.divideAndRemainder(B);
		
		if (A.compareTo(new BigInteger("0")) < 0) {
			if (B.compareTo(new BigInteger("0")) > 0) {
				dr[0] = dr[0].subtract(new BigInteger("1"));
				dr[1] = dr[1].add(B);
			} else {
				dr[0] = dr[0].add(new BigInteger("1"));
				dr[1] = dr[1].subtract(B);
			}
		}
		
		System.out.println(dr[0]);
		System.out.print(dr[1]);
		
		scan.close();
	}

}
