import java.util.*;
public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] count = new int[1000001];
		List<Integer> l = getChe(1000000);
		
		for(int i = 0; i < l.size(); i++)
			for(int j = 0; j <= i; j++)
				if(l.get(i)+l.get(j) <= 1000000)
					count[l.get(i)+l.get(j)]++;
		
		for(int i = 0; i < t; i++)
			System.out.println(count[scan.nextInt()]);
		
		scan.close();
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0);
	}

	private static List<Integer> getChe(int num) {
		int[] arr = new int[num+1];
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 2; i*i <= num; i++) { // ������ �� : i
			if(arr[i] == 1) // �̹� üũ�� ���� ����� Ȯ������ �ʴ´�.
				continue;
			for(int j = i+i; j <= num; j += i) // i�� ������ i�� ������� 1�� üũ
				arr[j] = 1;
		}
			
		for(int i = 2; i <= num; i++)
			if(arr[i] == 0)
				l.add(i);
		
		return l;
	}
}
