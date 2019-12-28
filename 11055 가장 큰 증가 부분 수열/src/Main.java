import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] array = new int[n];
		int[] sum = new int[n];
		
		for(int i = 0; i < n; i++)
			array[i] = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(sum[i] == 0)
				sum[i] = array[i];
						
			for(int j = 0; j < i; j++)
				if(array[i] > array[j])
					if(sum[i] < sum[j] + array[i])
						sum[i] = sum[j] + array[i];
		}
		
		Arrays.sort(sum);
		
		System.out.print(sum[sum.length-1]);
		
		scan.close();
	}

}
