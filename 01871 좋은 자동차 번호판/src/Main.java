import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			String plate = scan.next();
			String first = plate.split("-")[0];
			String second = plate.split("-")[1];
			
			int fValue = ((int) first.charAt(0) - 65) * 26 * 26
					+ ((int) first.charAt(1) - 65) * 26
					+ ((int) first.charAt(2) - 65);
			int sValue = Integer.parseInt(second);
			
			if (Math.abs(fValue - sValue) <= 100) {
				System.out.println("nice");
			} else {
				System.out.println("not nice");
			}
		}
		
		scan.close();
	}

}
