import java.util.*;
public class Main {
	static int[][] cache = new int[101][101];
	// -1은 아직 답이 계산되지 않았음을 의미한다.
	// 1은 해당 입력들이 서로 대응됨을 의미한다.
	// 0은 해당 입력들이 서로 대응되지 않음을 의미한다.
	static String W, S;
	// 패턴과 문자열
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		W = scan.next();
		// 패턴을 가져옴
		int N = scan.nextInt();
		// 문자열 개수
		for (int i = 0; i < N; i++) {
			S = scan.next();
			// 문자열을 가져옴
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 101; k++) {
					cache[j][k] = -1;
					// 캐쉬를 -1로 초기화합니다.
				}
			}
			
			if (match(0, 0)) {
				// match 함수의 결과가 true라면
				System.out.println(S);
				// 문자열을 출력합니다.
			}
		}
		
		scan.close();
	}
	
	public static boolean match(int w, int s) {
		// 와일드카드 패턴 W[w..]가 문자열 S[s..]에 대응되는지 여부를 반환한다.
		if (cache[w][s] != -1) {
			// 메모이제이션
			if (cache[w][s] == 1) {
				return true;
			} else {
				return false;
			}
		}
		
		while (s < S.length() && w < W.length() && (W.charAt(w) == S.charAt(s))) {
			// W[w]와 S[s]를 맞춰나간다.
			if (match(w+1, s+1)) {
				// 패턴과 문자열의 첫 한 글자씩을 떼고 이들이 서로 대응되는지 재귀 호출로 확인
				cache[w][s] = 1;
				return true;
			} else {
				cache[w][s] = 0;
				return false;
			}
		}
		// 더이상 대응할 수 없으면 왜 while문이 끝났는지 확인한다.
		
		if (w == W.length()) {
			// 2. 패턴 끝에 도달해서 끝난 경우: 문자열도 끝났어야 함
			if (s == S.length()) {
				cache[w][s] = 1;
				return true;
			} else {
				cache[w][s] = 0;
				return false;
			}
		}
		if (W.charAt(w) == '*') {
			// 4. *를 만나서 끝난 경우: *에 몇 글자를 대응해야 할지 재귀 호출하면서 확인한다.
			if (match(w+1, s) || (s < S.length() && match(w, s+1))) {
				// *에 아무 글자도 대응시키지 않을 것인지, 아니면 한 글자를 더 대응시킬 것인가 결정
				cache[w][s] = 1;
				return true;
			}
		}
		
		// 3. 이 외의 경우에는 모두 대응되지 않는다.
		cache[w][s] = 0;
		return false;
	}

}
