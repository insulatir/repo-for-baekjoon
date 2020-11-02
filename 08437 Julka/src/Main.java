import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger sum = scan.nextBigInteger();
		BigInteger up = scan.nextBigInteger();
		
		System.out.println(sum.divide(new BigInteger("2")).add((up.divide(new BigInteger("2")))));
		System.out.print(sum.divide(new BigInteger("2")).subtract((up.divide(new BigInteger("2")))));
		
		scan.close();
	}

}
