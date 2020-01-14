import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger K = scan.nextBigInteger();
		int L = scan.nextInt();
		int k = 0;
		
		boolean good = true;
		
		for (int i = 2; i < L; i++) {
			if (K.divideAndRemainder(new BigInteger(i+""))[1]
					.compareTo(new BigInteger("0")) == 0) {
				good = false;
				k = i;
				break;
			}
		}
		
		System.out.print(good?"GOOD":"BAD " + k);
		
		scan.close();
	}

}
