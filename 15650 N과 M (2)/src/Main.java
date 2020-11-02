import java.util.*;
public class Main {
	public static int N;
	public static int M;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		int[] array = new int[M];
		back(0, array);
		
		scan.close();
	}

	public static boolean promising(int x, int[] array) {
		for (int i = 0; i < x; i++) {
			if (array[i] >= array[x]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void back(int x, int[] array) {
		for (int i = 1; i <= N; i++) {
			array[x] = i; 
			
			if (promising(x, array)) {
				if (x == M-1) {
					for (int j = 0; j < M-1; j++) {
						System.out.print(array[j] + " ");
					}
					System.out.println(array[M-1]);
				} else {
					back(x+1, array);
				}
			}
		}
	}
}