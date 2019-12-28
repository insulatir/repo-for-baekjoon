import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		for (int i = 0; i < N; i++) {
			int p = scan.nextInt();
			int number = p / 10;
			int pot = p % 10;
			res += Math.pow(number, pot);
		}
		
		System.out.println(res);
		
		scan.close();
	}

}
