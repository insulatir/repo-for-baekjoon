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
		// 믈품의 수
		capacity = scan.nextInt();
		// 버틸 수 있는 무게
		for (int i = 0; i < n; i++) {
			weight[i] = scan.nextInt();
			// 물건의 무게
			value[i] = scan.nextInt();
			// 물건의 가치
		}
		
		for (int i = 0 ; i < 100001; i++) {
			for (int j = 0; j < 1001; j++) {
				cache[i][j] = -1;
				// 캐쉬 -1로 초기화
			}
		}
		
		System.out.println(pack(capacity, 0));
		// 결과 출력
		
		scan.close();
	}

	public static int pack(int capacity, int item) {
		// 캐리어에 남은 용량이 capacity일 때, item 이후의 물건들을 담아 얻을 수 있는 최대 절박도의 합을 반환
		if (item == n) {
			// 기저 사례: 더 담을 물건이 없을 때
			return 0;
		}
		
		if (cache[capacity][item] != -1)  {
			// 메모이제이션
			return cache[capacity][item];
		}
		
		cache[capacity][item] = pack(capacity, item + 1);
		// 이 물건을 담지 않을 경우
		if (capacity >= weight[item]) {
			// 담을 용량이 남아 있을 때
			cache[capacity][item] = Math.max(cache[capacity][item], pack(capacity - weight[item], item + 1) + value[item]);
			// 이 물건을 담을 경우
		}
		
		return cache[capacity][item];
		// 결과 반환
	}
}
