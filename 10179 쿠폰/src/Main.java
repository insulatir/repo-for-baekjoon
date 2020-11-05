import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			double price = scan.nextDouble();
			System.out.println("$" + String.format("%.2f", Math.round(price*0.8*100)/100.0));
		}
		
		scan.close();
	}

}
