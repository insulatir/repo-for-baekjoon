import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] num = new int[N+1];
		
		int p = 2;
		int count = 0;
		while (count > 0) {
			for (int i = 1; i < N/p; i++) {
				if (num[p * i] > 0) {
					continue;
				} else {
					num[p * i] += 1;
					count += 1;
				}
			}
			
			p = 
		}
		
		scan.close();
	}

}
