import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 1;
		long[] seqSum = new long[1001];
		
		for(int i = 1; sum <= 1000; i++) {
			sum += i-1;
			
			for(int j = 0; j < i; j++) {
				if(sum+j > 1000)
					break;
				
				seqSum[sum+j] = i + seqSum[sum+j-1];
			}
		}
		
		System.out.print(seqSum[b]-seqSum[a-1]);
		
		scan.close();
	}

}
