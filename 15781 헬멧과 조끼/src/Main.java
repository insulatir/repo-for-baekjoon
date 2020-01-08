import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] helmet = new int[N];
		int[] vest = new int[M];
		for (int i = 0; i < N; i++) {
			helmet[i] = scan.nextInt();
		}
		for (int i = 0; i < M; i++) {
			vest[i] = scan.nextInt();
		}
		
		Arrays.sort(helmet);
		Arrays.sort(vest);
		
		System.out.print(helmet[N-1]+vest[M-1]);
		
		scan.close();
	}

}
