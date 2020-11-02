import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static int N;
	public static int M;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		int[] res_array = new int[M];
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);
		
		back(0, res_array, array);
		
		scan.close();
	}
	
	public static boolean promising(int x, int[] array) {
		for (int i = 0; i < x; i++) {
			if (array[i] > array[x]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void back(int x, int[] res_array, int[] array) {
		for (int i = 1; i <= N; i++) {
			res_array[x] = array[i-1]; 
			
			if (promising(x, res_array)) {
				if (x == M-1) {
					for (int j = 0; j < M-1; j++) {
						System.out.print(res_array[j] + " ");
					}
					System.out.println(res_array[M-1]);
				} else {
					back(x+1, res_array, array);
				}
			}
		}
	}
}