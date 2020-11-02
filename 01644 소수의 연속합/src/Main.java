import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		List<Integer> prime = getChe(2, N);
		
		int count = 0;
		
		// �� ������
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

	// �����佺�׳׽��� ü 
	private static List<Integer> getChe(int n, int m) {
		int[] arr = new int[m+1];
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 2; i*i <= m; i++) { // ������ �� : i
			if(arr[i] == 1) // �̹� üũ�� ���� ����� Ȯ������ �ʴ´�.
				continue;
			for(int j = i+i; j <= m; j += i) // i�� ������ i�� ������� 1�� üũ
				arr[j] = 1;
		}
			
		for(int i = n; i <= m; i++)
			if(arr[i] == 0 && i != 1)
				l.add(i);
		
		return l;
	}	
}
