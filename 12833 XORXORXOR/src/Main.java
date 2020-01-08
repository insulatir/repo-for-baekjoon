import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int res = A;
		for (int i = 0; i < C; i++) {
			res ^= B;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
