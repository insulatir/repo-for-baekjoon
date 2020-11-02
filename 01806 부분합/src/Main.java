import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int S = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int len = Integer.MAX_VALUE;
		
		// 투 포인터
		int sum = 0;
		int s = 0;
		int e = 0;
		while (true) {
			if (sum >= S) {
				sum -= arr[s];
				s += 1;
			} else {
				if (e == N) {
					break;
				} 
				
				sum += arr[e];
				e += 1;
			}
			
			if (sum >= S) {
				if (len > e - s) {
					len = e - s;
				}
			}
		}
		
		System.out.print(len == Integer.MAX_VALUE ? 0 : len);
		
		scan.close();
	}

}
