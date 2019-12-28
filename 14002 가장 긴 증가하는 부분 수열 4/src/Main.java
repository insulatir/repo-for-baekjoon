import java.util.*;
public class Main {
	static int n;
	static int[] cache = new int[1001];
	static int[] S = new int[1000];
	static int[] choices = new int[1001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		// ������ ����
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
			// ����
		}
		
		for (int i = 0; i < 1001; i++) {
			cache[i] = -1;
			choices[i] = -1;
			// ĳ�� -1�� �ʱ�ȭ
		}
		
		System.out.println(lis(-1)-1);
		// -1������ 1�� �ʰ��� ����� �����Ƿ� 1�� ���־�� ��
		List<Integer> seq = new ArrayList<Integer>();
		// ���� LIS
		reconstruct(-1, seq);
		// ���� LIS�� ����
		for (int i = 0; i < seq.size(); i++) {
			System.out.print(seq.get(i) + " ");
			// ���� LIS ���
		}
		
		scan.close();
	}

	public static int lis(int start) {
		// S[start]���� �����ϴ� ���� �κ� ���� �� �ִ� ���� ��ȯ
		if (cache[start+1] != -1) {
			// �޸������̼�
			return cache[start+1];
		}
		
		cache[start+1] = 1;
		// �׻� S[start]�� �ֱ� ������ ���̴� ���� 1
		int bestNext = -1;
		// -1�� �ʱ�ȭ
		for (int next = start+1; next < n; next++) {
			if (start == -1 || S[start] < S[next]) {
				// ��ġ�� -1�̰ų� ���� ��ġ�� ���� ���� ��ġ�� ������ Ŭ ���
				int cand = lis(next) + 1;
				if (cand > cache[start+1]) {
					// ���� ��ġ���� �����ϴ� LIS�� ���� 1�� ���� ���� ���� ��ġ�� LIS ������ Ŭ ���
					cache[start+1] = cand;
					// ĳ���� ū ���� ����
					bestNext = next;
					// ���� ��ġ ����
				}
			}
		}
		
		choices[start+1] = bestNext;
		// �ּ��� ������ ����
		return cache[start+1];
		// ��� ��ȯ
	}
	
	public static void reconstruct(int start, List<Integer> seq) {
		// S[start]���� �����ϴ� LIS�� seq�� ����
		if (start != -1) {
			// -1�� �ƴ� ���� �ִٸ�
			seq.add(S[start]);
			// seq�� ����
		}
		int next = choices[start+1];
		// ���� ��ġ 
		if (next != -1) {
			// ���� ��ġ�� -1�� �ƴ϶��
			reconstruct(next, seq);
			// ���� ��ġ�� ���ڷ� �Ͽ� ��� ȣ��
		}
	}
}
