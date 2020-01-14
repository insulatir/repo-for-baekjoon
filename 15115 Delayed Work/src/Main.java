import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double K = scan.nextDouble();
		double P = scan.nextDouble();
		double X = scan.nextDouble();
		long M = Math.round(Math.sqrt(K * P / X));
		double cost = K * P / (1.0 * M) + M * X;
		System.out.print(String.format("%.3f", Math.round(cost * 1000.0) / 1000.0));
		
		scan.close();
	}

}
