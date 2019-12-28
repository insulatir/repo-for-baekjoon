import java.math.BigDecimal;
import java.util.*;
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal a = scan.nextBigDecimal();
		BigDecimal b = scan.nextBigDecimal();
		System.out.println(a.divide(b, 2001, BigDecimal.ROUND_UP));
		scan.close();
	}

}
