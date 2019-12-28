import java.util.*;
public class Main {
	static int n;
	static int[] cache = new int[1001];
	static int[] S = new int[1000];
	static int[] choices = new int[1001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		// 수열의 길이
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
			// 수열
		}
		
		for (int i = 0; i < 1001; i++) {
			cache[i] = -1;
			choices[i] = -1;
			// 캐쉬 -1로 초기화
		}
		
		System.out.println(lis(-1)-1);
		// -1때문에 1이 초과된 결과가 나오므로 1을 빼주어야 함
		List<Integer> seq = new ArrayList<Integer>();
		// 실제 LIS
		reconstruct(-1, seq);
		// 실제 LIS을 구함
		for (int i = 0; i < seq.size(); i++) {
			System.out.print(seq.get(i) + " ");
			// 실제 LIS 출력
		}
		
		scan.close();
	}

	public static int lis(int start) {
		// S[start]에서 시작하는 증가 부분 수열 중 최대 길이 반환
		if (cache[start+1] != -1) {
			// 메모이제이션
			return cache[start+1];
		}
		
		cache[start+1] = 1;
		// 항상 S[start]는 있기 때문에 길이는 최하 1
		int bestNext = -1;
		// -1로 초기화
		for (int next = start+1; next < n; next++) {
			if (start == -1 || S[start] < S[next]) {
				// 위치가 -1이거나 다음 위치의 값이 현재 위치의 값보다 클 경우
				int cand = lis(next) + 1;
				if (cand > cache[start+1]) {
					// 다음 위치부터 시작하는 LIS의 값에 1을 더한 값이 현재 위치의 LIS 값보다 클 경우
					cache[start+1] = cand;
					// 캐쉬에 큰 값을 저장
					bestNext = next;
					// 다음 위치 저장
				}
			}
		}
		
		choices[start+1] = bestNext;
		// 최선의 선택을 저장
		return cache[start+1];
		// 결과 반환
	}
	
	public static void reconstruct(int start, List<Integer> seq) {
		// S[start]에서 시작하는 LIS를 seq에 저장
		if (start != -1) {
			// -1이 아닌 값이 있다면
			seq.add(S[start]);
			// seq에 저장
		}
		int next = choices[start+1];
		// 다음 위치 
		if (next != -1) {
			// 다음 위치가 -1이 아니라면
			reconstruct(next, seq);
			// 다음 위치를 인자로 하여 재귀 호출
		}
	}
}
