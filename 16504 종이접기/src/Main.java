import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long res = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				res += scan.nextInt();
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
