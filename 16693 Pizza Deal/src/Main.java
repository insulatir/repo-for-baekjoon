import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double A1 = scan.nextDouble();
		double P1 = scan.nextDouble();
		double R1 = scan.nextDouble();
		double P2 = scan.nextDouble();
		
		if (A1 / P1 < (R1 * R1 * Math.PI) / P2) {
			System.out.println("Whole pizza");
		} else {
			System.out.println("Slice of pizza");
		}
		
		scan.close();
	}

}
