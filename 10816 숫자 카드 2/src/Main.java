import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] count = new int[20000001];
		for (int i = 0; i < N; i++) {
			count[scan.nextInt()+10000000] += 1;
		}
		
		int M = scan.nextInt();
		for (int i = 0; i < M; i++) {
			System.out.print(count[scan.nextInt()+10000000] + " ");
		}
		
		scan.close();
	}

	
}
