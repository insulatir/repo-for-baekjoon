import java.util.*;
public class Main {
	public static int N;
	public static int count;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		int[] queen = new int[N];
		
		backtracking(0, queen);
		
		System.out.print(count);
		
		scan.close();
	}

	public static boolean promising(int x, int[] queen) {
		for (int i = 0; i < x; i++) {
			if (queen[i] == queen[x] || Math.abs(queen[i] - queen[x]) == x - i) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void backtracking(int x, int[] queen) {
		for (int i = 0; i < N; i++) {
			queen[x] = i;
			
			if (promising(x, queen)) {
				if (x == N-1) {
					count += 1;
					return;
				}
				
				backtracking(x+1, queen);
			}
		}
	}
}
