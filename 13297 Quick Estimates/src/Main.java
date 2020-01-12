import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0;i < N; i++) {
			String cost = scan.next();
			System.out.println(cost.length());
		}
		
		scan.close();
	}

}
