
public class Main {

	public static void main(String[] args) {
		/*long start1 = System.currentTimeMillis();
		getChe1(50000);
		long end1 = System.currentTimeMillis();
		System.out.println("\n" + (end1-start1)/1000.0);
		
		long start2 = System.currentTimeMillis();
		getChe2(50000);
		long end2 = System.currentTimeMillis();
		System.out.println("\n" + (end2-start2)/1000.0);
		
		long start3 = System.currentTimeMillis();
		getChe3(50000);
		long end3 = System.currentTimeMillis();
		System.out.println("\n" + (end3-start3)/1000.0);
		*/
		getChe(2, 100);
	}
	
	// 에라토스테네스의 체 1
	private static void getChe1(int num) {
		int[] arr = new int[num+1];
		
		for(int i = 2; i <= num; i++) // 나누는 값 : i
			for(int j = 2; j <= num; j++)
				if(j != i && j%i == 0) // 자신과 같지 않고 딱 나누어떨지면 소수가 아님
					arr[j] = 1; // 소수가 아닌 경우 1을 넣어둔다.
		
		for(int i = 2; i <= num; i++)
			if(arr[i] == 0)
				System.out.print(i + " ");
	}
	
	// 에라토스테네스의 체 2
	private static void getChe2(int num) {
		int[] arr = new int[num+1];
		
		for(int i = 2; i <= num; i++) { // 나누는 값 : i
			if(arr[i] == 1) // 이미 체크된 수의 배수는 확인하지 않는다.
				continue;
			for(int j = i+i; j <= num; j += i) // i를 제외한 i의 배수들은 1로 체크
				arr[j] = 1;
		}
			
		for(int i = 2; i <= num; i++)
			if(arr[i] == 0)
				System.out.print(i + " ");
	}
				
	// 에라토스테네스의 체 3
	private static void getChe3(int num) {
		int[] arr = new int[num+1];
		
		for(int i = 2; i*i <= num; i++) { // 나누는 값 : i
			if(arr[i] == 1) // 이미 체크된 수의 배수는 확인하지 않는다.
				continue;
			for(int j = i+i; j <= num; j += i) // i를 제외한 i의 배수들은 1로 체크
				arr[j] = 1;
		}
			
		for(int i = 2; i <= num; i++)
			if(arr[i] == 0)
				System.out.print(i + " ");
	}
	
	// 에라토스테네스의 체 
	private static void getChe(int n, int m) {
		int[] arr = new int[m+1];
		
		for(int i = n; i*i <= m; i++) { // 나누는 값 : i
			if(arr[i] == 1) // 이미 체크된 수의 배수는 확인하지 않는다.
				continue;
			for(int j = i+i; j <= m; j += i) // i를 제외한 i의 배수들은 1로 체크
				arr[j] = 1;
		}
			
		for(int i = n; i <= m; i++)
			if(arr[i] == 0)
				System.out.print(i + " ");
	}
}
