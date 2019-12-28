import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		BigInteger[] on = new BigInteger[3];
		on[0] = new BigInteger("0");
		on[1] = new BigInteger("1");
		
		for (int i = 2; i <= n; i++) {
			on[2] = on[0].add(on[1]);
			on[0] = on[1];
			on[1] = on[2];
		}
		
		System.out.println(n == 0 ? 0 : on[1]);
		
		scan.close();
	}

}
