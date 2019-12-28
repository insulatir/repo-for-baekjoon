import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] B = new int[N+1];
		for (int i = 1; i <= N; i++) {
			B[i] = scan.nextInt() * i;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(B[i+1] - B[i] + " ");
		}
		
		
		
		scan.close();
	}

}
