import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		int K = scan.nextInt();
		int P = scan.nextInt();
		
		System.out.println((2 * P * C * C * C + 3 * (P + K) * C * C + (P + 3 * K) * C) / 6);
		
		scan.close();
	}

}
