import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] cards = new int[N];
		for (int i = 0; i < N; i++) {
			cards[i] = scan.nextInt();
		}

		int[] sums = new int[N*(N-1)*(N-2)/6];
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				for (int k = j+1; k < N; k++) {
					sums[count] = cards[i] + cards[j] + cards[k];
					count += 1;
				}
			}
		}
		
		Arrays.sort(sums);
		int res = Arrays.binarySearch(sums, M);
		System.out.println(sums[Math.abs(res+1)-1]);
		
		scan.close();
	}

}
