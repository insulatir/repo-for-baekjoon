import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int res = 0;
		int divide = 1;
		while (N/divide > 0) {
			res += N/divide;
			divide *= M;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
