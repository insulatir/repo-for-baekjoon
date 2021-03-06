import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// n을 가져옵니다.
		int[] array = new int[n];
		// 수열 A를 위한 배열입니다.
		int[][] len = new int[2][n];
		// 길이를 저장합니다.
		// 앞 부분과 뒤 부분으로 나눕니다.
		int[] lens = new int[n];
		// 앞 부분과 뒤 부분의 길이를 합칩니다.
		
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			// 수열 A를 가져옵니다.
		}
		
		for (int i = 0; i < n; i++) {
			if (len[0][i] == 0) {
				// 기준이 되는 i번째 원소
				len[0][i] = 1;
				// 길이는 1입니다.
			}
						
			for (int j = 0; j < i; j++) {
				// 0번째 부터 기준점의 바로 앞까지
				if (array[i] > array[j]) {
					// j번째 원소가 기준 원소보다 작다면
					if (len[0][i] < len[0][j] + 1) {
						// 앞 부분이므로 0번째 길이에 저장합니다.
						// 기준 원소까지의 길이보다 j번째 원소까지의 길이 + 1이 더 크다면 이는 기준 원소까지의 수열의 길이가 최대가 아니므로
						len[0][i] = len[0][j] + 1;
						// 최대 길이로 바꾸어줍니다.
					}
				}
			}
		}
	
		for (int i = n - 1; i >= 0; i--) {
			// 위의 반복문과 동일하지만 마지막부터 기준점의 바로 뒤까지인 점만 다릅니다.
			if (len[1][i] == 0) {
				len[1][i] = 1;
			}
			
			for (int j = n - 1; j > i; j--) {
				if (array[i] > array[j]) {
					if (len[1][i] < len[1][j] + 1) {
						len[1][i] = len[1][j] + 1;
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			lens[i] = len[0][i] + len[1][i] - 1;
			// 앞 부분의 길이와 뒤 부분의 길이를 합쳐줍니다.
			// 기준 원소의 길이가 1로 겹치므로 1을 빼줍니다.
		}
		
		Arrays.sort(lens);
		// 퀵 정렬로 정렬합니다.
		
		System.out.println(lens[lens.length-1]);
		// 오름차순이므로 가장 긴 수열의 길이는 마지막 원소가 됩니다.
		
		scan.close();
	}

}
