import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			double A = scan.nextDouble();
			double B = scan.nextDouble();
			double C = scan.nextDouble();
			double D = scan.nextDouble();
			double E = scan.nextDouble();
			System.out.println("$" + String.format("%.2f", 350.34*A+230.90*B+190.55*C+125.30*D+180.90*E));
		}
		
		scan.close();
	}

}
