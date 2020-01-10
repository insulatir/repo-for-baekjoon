import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			long A = scan.nextLong();
			long B = scan.nextLong();
			long res = (A / B) * (A / B);
			System.out.println(res);
		}
		
		scan.close();
	}

}
