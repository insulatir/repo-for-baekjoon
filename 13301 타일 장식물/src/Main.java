import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long[] fibo = new long[3];
		fibo[0] = 1;
		fibo[1] = 1;
		fibo[2] = 1;
		int N = scan.nextInt();
		for (int i = 2; i <= N; i++) {
			fibo[2] = fibo[0] + fibo[1];
			fibo[0] = fibo[1];
			fibo[1] = fibo[2];
		}
		
		System.out.print(2*(fibo[0]+fibo[1]));
		
		scan.close();
	}

}
