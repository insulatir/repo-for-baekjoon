import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger n = scan.nextBigInteger();
		while (!n.equals(new BigInteger("0"))) {
			n = n.subtract(new BigInteger("1"));
			String n2 = n.toString(2);

			System.out.print("{ ");
			
			for (int i = n2.length()-1; i > 0; i--) {
				BigInteger mul = new BigInteger("3").pow(n2.length()-1-i);
				
				if (n2.charAt(i) == '1') {
					System.out.print(mul + ", ");
				}
			}
			
			BigInteger mul = new BigInteger("3").pow(n2.length()-1);
			System.out.println(n.equals(new BigInteger("0")) ? "}" : mul + " }");
			
			n = scan.nextBigInteger();
		}
		
		scan.close();
	}

}
