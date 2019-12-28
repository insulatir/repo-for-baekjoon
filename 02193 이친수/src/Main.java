import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[][] pin = new long[91][2];
		pin[1][1] = 1; 
		for(int i = 2; i < 91; i++) {
			pin[i][0] = pin[i-1][0] + pin[i-1][1];
			pin[i][1] = pin[i-1][0];
		}
		System.out.print(pin[n][0]+pin[n][1]);
		scan.close();
	}

}
