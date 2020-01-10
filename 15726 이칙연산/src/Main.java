import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		System.out.print(B>C?(int)(A*B/C):(int)(A/B*C));
		
		scan.close();
	}

}
