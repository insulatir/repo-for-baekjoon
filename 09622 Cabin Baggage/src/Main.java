import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int total = 0;
		for (int i = 0; i < t; i++) {
			double len = scan.nextDouble();
			double wid = scan.nextDouble();
			double dep = scan.nextDouble();
			double wei = scan.nextDouble();
			
			if (((len <= 56 && wid <= 45 && dep <= 25) || len+wid+dep <= 125) && wei <= 7) {
				System.out.println(1);
				total += 1;
			} else {
				System.out.println(0);
			}
		}
		
		System.out.print(total);
		
		scan.close();
	}

}
