import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigDecimal a = scan.nextBigDecimal();
		BigDecimal b = scan.nextBigDecimal();
		BigDecimal c = scan.nextBigDecimal();
		System.out.print(a.multiply(b).divide(c, MathContext.DECIMAL128));
		
		scan.close();
	}

}
