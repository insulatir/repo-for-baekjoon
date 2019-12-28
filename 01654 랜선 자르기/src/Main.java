import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int N = scan.nextInt();
		int[] lan = new int[K];
		for(int i = 0; i < K; i++)
			lan[i] = scan.nextInt();
		Arrays.sort(lan);
		System.out.print(find(N, lan));
		scan.close();
	}
	
	private static long find(int N, int[] lan) {
		long left, mid, right, num;
		num = 0;
		left = 1;
		right = lan[lan.length-1];
		mid = (left+right)/2;
		for(; left <= right; ) {
			mid = (left+right)/2;
			num = 0;
			for(int i = 0; i < lan.length; i++) {
				num += lan[i] / mid;
			}
			if(num < N) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return right;
	}
}
