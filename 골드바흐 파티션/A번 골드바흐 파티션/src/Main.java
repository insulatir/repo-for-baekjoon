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
		
		for(int i = 2; i*i <= num; i++) { // 나누는 값 : i
			if(arr[i] == 1) // 이미 체크된 수의 배수는 확인하지 않는다.
				continue;
			for(int j = i+i; j <= num; j += i) // i를 제외한 i의 배수들은 1로 체크
				arr[j] = 1;
		}
			
		for(int i = 2; i <= num; i++)
			if(arr[i] == 0)
				l.add(i);
		
		return l;
	}
}
