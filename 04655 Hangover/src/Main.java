import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigDecimal len = scan.nextBigDecimal();
		while (len.compareTo(new BigDecimal("0")) != 0) {
			BigDecimal n = new BigDecimal("2");
			int card = 0;
			while (len.compareTo(new BigDecimal("0")) > 0) {
				len = len.subtract(new BigDecimal("1")
						.divide(n, MathContext.DECIMAL128));
				n = n.add(new BigDecimal("1"));
				card += 1;
			}
			
			System.out.println(card + " card(s)");
			
			len = scan.nextBigDecimal();
		}
		
		scan.close();
	}

}
