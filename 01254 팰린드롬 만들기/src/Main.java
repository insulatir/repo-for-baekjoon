import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		System.out.println(maxOverlap(S, (new StringBuffer(S)).reverse().toString()));
		
		scan.close();
	}

	public static int maxOverlap(String a, String b) {
		// a의 접미사이면서 b의 접두사인 문자열의 최대 길이
		int n = a.length();
		int m = b.length();
		int[] pi = getPartialMatch(b);
		int begin = 0;
		int matched = 0;
		// begin = matched = 0에서부터 시작
		while (begin < m) {
			if (matched < m && a.charAt(begin + matched) == b.charAt(matched)) {
				// 만약 a의 해당 글자가 b의 해당 글자와 같다면
				matched += 1;
				if (begin + matched == n) {
					// a의 마지막 글자와 b의 글자가 서로 일치했을 때
					return matched + (n-matched)*2;
					// 팰린드롬의 길이 반환
				}
			} else {
				if (matched == 0) {
					begin += 1;
				} else {
					begin += matched - pi[matched-1];
					matched = pi[matched-1];
				}
			}
		}
		
		return 2*n;
	}
	
	public static int[] getPartialMatch(String N) {
		// pi[i] = N[..i]의 접미사도 되고 접두사도 되는 문자열의 최대 길이
		int m = N.length();
		int[] pi = new int[m];
		int begin = 1;
		int matched = 0;
		while (begin + matched < m) {
			if (N.charAt(begin + matched) == N.charAt(matched)) {
				matched += 1;
				pi[begin+matched-1] = matched;
			} else {
				if (matched == 0) {
					begin += 1;
				} else {
					begin += matched - pi[matched-1];
					matched = pi[matched-1];
				}
			}
		}
		
		return pi;
	}
}
