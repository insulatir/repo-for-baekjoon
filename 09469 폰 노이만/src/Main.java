import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int P = scan.nextInt();
		for (int i = 1; i <= P; i++) {
			int N = scan.nextInt();
			double D = scan.nextDouble();
			double A = scan.nextDouble();
			double B = scan.nextDouble();
			double F = scan.nextDouble();
			System.out.println(N + " " + D/(A+B)*F);
		}
		
		scan.close();
	}

}
