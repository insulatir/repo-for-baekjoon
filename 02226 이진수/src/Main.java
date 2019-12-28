import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		BigInteger[] zero = new BigInteger[1001];
		zero[1] = new BigInteger("0");
		for (int i = 2; i < 1001; i++) {
			zero[i] = zero[i-1].multiply(new BigInteger("2"));
			zero[i] = i % 2 == 0 ? zero[i].add(new BigInteger("1")) : zero[i].subtract(new BigInteger("1"));
		}
		
		System.out.println(zero[N]);
		
		scan.close();
	}

}
