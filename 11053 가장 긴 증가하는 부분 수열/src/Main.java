import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// n을 가져옵니다.
		int[] array = new int[n];
		// 수열 A를 위한 배열입니다.
		int[] len = new int[n];
		// 길이를 저장합니다.
		
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			// 수열 A를 가져옵니다.
		}
		
		for(int i = 0; i < n; i++) {
			if(len[i] == 0) {
				// 기준이 되는 i번째 원소
				len[i] = 1;
				// 자기 자신이 수열에 포함되므로 길이는 1이 됨
			}
						
			for(int j = 0; j < i; j++) {	
				// 0번째 부터 기준점의 바로 앞까지
				if(array[i] > array[j]) {
					// 증가 수열
					if(len[i] < len[j] + 1) {
						// 기준 원소까지의 길이보다 j번째 원소까지의 길이 + 1이 더 크다면 이는 기준 원소까지의 수열의 길이가 최대가 아니므로
						len[i] = len[j] + 1;
						// 최대 길이로 바꾸어줍니다.
					}
				}
			}
		}
		
		Arrays.sort(len);
		// 퀵 정렬로 정렬합니다.
		
		System.out.print(len[len.length-1]);
		// 오름차순이므로 가장 긴 수열의 길이는 마지막 원소가 됩니다.
		
		scan.close();
	}

}
