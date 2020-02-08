import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] basket = new int[N+1];
		for (int i = 1; i <= N; i++) {
			basket[i] = i;
		}
		
		for (int k = 0; k < M; k++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.print(basket[i]);
			if (i < N) {
				System.out.print(" ");
			}
		}
		
		scan.close();
	}

}
