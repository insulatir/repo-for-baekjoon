import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		String bin =Long.toBinaryString(n);
		BigInteger result = new BigInteger("0");
		
		for (int i = 0; i < bin.length(); i++) {
			int ith = bin.length() - i - 1;
			
			if (bin.charAt(i) == '1') {
				String str = pow3(ith) + "";
				BigInteger ithBig = new BigInteger(str);
				result = result.add(ithBig);
			}
		}
		
		System.out.println(result);
		
		scan.close();
	}
	
	public static BigInteger pow3(int n) {
		if (n == 0) {
			return new BigInteger("1");
		} else if (n == 1) {
			return new BigInteger("3");
		}
		
		if (n % 2 == 1) {
			return pow3(n - 1).multiply(new BigInteger("3"));
		}
		
		BigInteger divide2 = pow3(n / 2);
		return divide2.multiply(divide2);
	}

}
