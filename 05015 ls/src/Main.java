import java.util.*;
public class Main {
	static int[][] cache = new int[101][101];
	// -1�� ���� ���� ������ �ʾ����� �ǹ��Ѵ�.
	// 1�� �ش� �Էµ��� ���� �������� �ǹ��Ѵ�.
	// 0�� �ش� �Էµ��� ���� �������� ������ �ǹ��Ѵ�.
	static String W, S;
	// ���ϰ� ���ڿ�
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		W = scan.next();
		// ������ ������
		int N = scan.nextInt();
		// ���ڿ� ����
		for (int i = 0; i < N; i++) {
			S = scan.next();
			// ���ڿ��� ������
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 101; k++) {
					cache[j][k] = -1;
					// ĳ���� -1�� �ʱ�ȭ�մϴ�.
				}
			}
			
			if (match(0, 0)) {
				// match �Լ��� ����� true���
				System.out.println(S);
				// ���ڿ��� ����մϴ�.
			}
		}
		
		scan.close();
	}
	
	public static boolean match(int w, int s) {
		// ���ϵ�ī�� ���� W[w..]�� ���ڿ� S[s..]�� �����Ǵ��� ���θ� ��ȯ�Ѵ�.
		if (cache[w][s] != -1) {
			// �޸������̼�
			if (cache[w][s] == 1) {
				return true;
			} else {
				return false;
			}
		}
		
		while (s < S.length() && w < W.length() && (W.charAt(w) == S.charAt(s))) {
			// W[w]�� S[s]�� ���糪����.
			if (match(w+1, s+1)) {
				// ���ϰ� ���ڿ��� ù �� ���ھ��� ���� �̵��� ���� �����Ǵ��� ��� ȣ��� Ȯ��
				cache[w][s] = 1;
				return true;
			} else {
				cache[w][s] = 0;
				return false;
			}
		}
		// ���̻� ������ �� ������ �� while���� �������� Ȯ���Ѵ�.
		
		if (w == W.length()) {
			// 2. ���� ���� �����ؼ� ���� ���: ���ڿ��� ������� ��
			if (s == S.length()) {
				cache[w][s] = 1;
				return true;
			} else {
				cache[w][s] = 0;
				return false;
			}
		}
		if (W.charAt(w) == '*') {
			// 4. *�� ������ ���� ���: *�� �� ���ڸ� �����ؾ� ���� ��� ȣ���ϸ鼭 Ȯ���Ѵ�.
			if (match(w+1, s) || (s < S.length() && match(w, s+1))) {
				// *�� �ƹ� ���ڵ� ������Ű�� ���� ������, �ƴϸ� �� ���ڸ� �� ������ų ���ΰ� ����
				cache[w][s] = 1;
				return true;
			}
		}
		
		// 3. �� ���� ��쿡�� ��� �������� �ʴ´�.
		cache[w][s] = 0;
		return false;
	}

}
