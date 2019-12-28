import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] straw = new int[N];
		for (int i = 0; i < N; i++) {
			straw[i] = scan.nextInt();
		}

		Arrays.sort(straw);
		
		boolean ok = false;
		
		outerloop:
		for (int i = N-1; i >= 0; i--) {
			for (int j = i-1; j >= 0; j--) {
				for (int k = j-1; k >= 0; k--) {
					int a = straw[k];
					int b = straw[j];
					int c = straw[i];
					
					if (a + b > c) {
						ok = true;
						System.out.println(a + b + c);
						break outerloop;
					}
				}
			}
		}
		
		if (!ok) {
			System.out.println(-1);
		}
		
		scan.close();
	}

}
