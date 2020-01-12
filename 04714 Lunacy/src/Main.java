import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double X = scan.nextDouble();
		while (X != -1) {
			System.out.println("Objects weighing " + String.format("%.2f", X) + " on Earth will weigh " + String.format("%.2f", X * 0.167) + " on the moon.");
			
			X = scan.nextDouble();
		}
		
		scan.close();
	}

}
