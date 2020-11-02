import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		BigInteger sum = new BigInteger("0");
		for (int i = 0; i < N; i++) {
			sum = sum.add(scan.nextBigInteger());
		}
		System.out.println(sum.equals(new BigInteger("0")) ? 
				0 : sum.compareTo(new BigInteger("0")) < 0 ? "-" : "+");
		
		N = scan.nextInt();
		sum = new BigInteger("0");
		for (int i = 0; i < N; i++) {
			sum = sum.add(scan.nextBigInteger());
		}
		System.out.println(sum.equals(new BigInteger("0")) ? 
				0 : sum.compareTo(new BigInteger("0")) < 0 ? "-" : "+");
		
		N = scan.nextInt();
		sum = new BigInteger("0");
		for (int i = 0; i < N; i++) {
			sum = sum.add(scan.nextBigInteger());
		}
		System.out.print(sum.equals(new BigInteger("0")) ? 
				0 : sum.compareTo(new BigInteger("0")) < 0 ? "-" : "+");
		
		
		
		scan.close();
	}

}
