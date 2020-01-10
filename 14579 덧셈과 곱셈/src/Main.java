import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		BigInteger res = new BigInteger("1");
		
		for (int i = a; i <= b; i++) {
			res = res.multiply(new BigInteger(i+""))
					.multiply(new BigInteger(i+1+""))
					.divide(new BigInteger("2"));
		}
		
		System.out.print(res
				.divideAndRemainder(new BigInteger("14579"))
				[1]);
		
		scan.close();
	}

}
