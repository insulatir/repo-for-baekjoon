import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		
		System.out.print(N-Math.abs(M-K));
		
		scan.close();
	}

}
