import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] sinker = new int[N+2];
		for (int i = 1; i <= N; i++) {
			sinker[i] = scan.nextInt();
		}
		sinker[N+1] = Integer.MAX_VALUE;
		
		Arrays.sort(sinker);
		
		int beforeSum = 0;
		int sum = 0;
		int exist = 0;
		int index = 0;
		for (int i = 0; i <= N; i++) {
			sum += sinker[i];
			exist = (sum + 1) - sinker[i+1];
			index = Arrays.binarySearch(sinker, exist);
			if (index < 0) {
				exist = (sum + 1) - beforeSum;
				index = Arrays.binarySearch(sinker, exist);
				if (index < 0) {
					System.out.println(sum + 1);
					break;
				}
			}
			beforeSum = sum;
		}
		
		scan.close();
	}

}
