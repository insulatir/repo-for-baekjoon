import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int k = scan.nextInt();
		long result = 1;
		int[] seg = new int[k];
		
		for(int i = 0; i < k; i++) 
			seg[i] = s/k;
		
		for(int i = 0; i < s%k; i++)
			seg[i]++;
		
		for(int i = 0; i < k; i++)
			result *= seg[i];
		
		System.out.print(result);
		
		scan.close();
	}

}
