import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double D = scan.nextDouble();
		double RH = scan.nextDouble();
		double RV = scan.nextDouble();
		
		while (D != 0 && RH != 0 && RV != 0) {
			System.out.println("Horizontal DPI: " + 
					String.format("%.2f", Math.sqrt(337) * RH / (16 * D)));
					
					System.out.println("Vertical DPI: " + 
							String.format("%.2f", Math.sqrt(337) * RV / (9 * D)));
			D = scan.nextDouble();
			RH = scan.nextDouble();
			RV = scan.nextDouble();
		}
		
		scan.close();
	}

}
