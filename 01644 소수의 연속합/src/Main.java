import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		List<Integer> prime = getChe(2, N);
		
		int count = 0;
		
		// 투 포인터
		int sum = 0;
		int s = 0;
		int e = 0;
		while (true) {
			if (sum >= N) {
				sum -= prime.get(s);
				s += 1;
			} else if (e == prime.size()) {
				break;
			} else {
				sum += prime.get(e);
				e += 1;
			}
			
			if (sum == N) {
				count += 1;
			}
		}
		
		System.out.print(count);
		
		scan.close();
	}

	// 에라토스테네스의 체 
	private static List<Integer> getChe(int n, int m) {
		int[] arr = new int[m+1];
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 2; i*i <= m; i++) { // 나누는 값 : i
			if(arr[i] == 1) // 이미 체크된 수의 배수는 확인하지 않는다.
				continue;
			for(int j = i+i; j <= m; j += i) // i를 제외한 i의 배수들은 1로 체크
				arr[j] = 1;
		}
			
		for(int i = n; i <= m; i++)
			if(arr[i] == 0 && i != 1)
				l.add(i);
		
		return l;
	}	
}
