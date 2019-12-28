import java.util.*;
public class Main {
	static int n;
	static int capacity;
	static int[] weight = new int[100];
	static int[] value = new int[100];
	static int[][] cache = new int[100001][1001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		// ��ǰ�� ��
		capacity = scan.nextInt();
		// ��ƿ �� �ִ� ����
		for (int i = 0; i < n; i++) {
			weight[i] = scan.nextInt();
			// ������ ����
			value[i] = scan.nextInt();
			// ������ ��ġ
		}
		
		for (int i = 0 ; i < 100001; i++) {
			for (int j = 0; j < 1001; j++) {
				cache[i][j] = -1;
				// ĳ�� -1�� �ʱ�ȭ
			}
		}
		
		System.out.println(pack(capacity, 0));
		// ��� ���
		
		scan.close();
	}

	public static int pack(int capacity, int item) {
		// ĳ��� ���� �뷮�� capacity�� ��, item ������ ���ǵ��� ��� ���� �� �ִ� �ִ� ���ڵ��� ���� ��ȯ
		if (item == n) {
			// ���� ���: �� ���� ������ ���� ��
			return 0;
		}
		
		if (cache[capacity][item] != -1)  {
			// �޸������̼�
			return cache[capacity][item];
		}
		
		cache[capacity][item] = pack(capacity, item + 1);
		// �� ������ ���� ���� ���
		if (capacity >= weight[item]) {
			// ���� �뷮�� ���� ���� ��
			cache[capacity][item] = Math.max(cache[capacity][item], pack(capacity - weight[item], item + 1) + value[item]);
			// �� ������ ���� ���
		}
		
		return cache[capacity][item];
		// ��� ��ȯ
	}
}
