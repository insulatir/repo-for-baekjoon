import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = scan.nextInt();
		for (int i = 0; i < M; i++) {
			int m = scan.nextInt();
			if (Arrays.binarySearch(arr, m) < 0) {
				System.out.print(0 + " ");
			} else {
				System.out.print(1 + " ");
			}
		}
		
		scan.close();
	}

}
