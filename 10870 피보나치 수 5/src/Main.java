import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] fibo = new int[3];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibo[2] = fibo[0] + fibo[1];
			
			fibo[0] = fibo[1];
			fibo[1] = fibo[2];
		}
		
		System.out.print(n < 2 ? fibo[n] : fibo[2]);
		
		scan.close();
	}

}
