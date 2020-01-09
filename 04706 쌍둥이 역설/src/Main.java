import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		while (a*b != 0) {
			double res = Math.sqrt((a*a-b*b)/(a*a));
			System.out.println(String.format("%.3f", res));
			
			a = scan.nextDouble();
			b = scan.nextDouble();
		}
		
		scan.close();
	}

}
