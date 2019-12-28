import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		System.out.println(a.add(b));
		scan.close();
	}

}
