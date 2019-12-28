import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		int[] sum = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = scan.nextInt();
		sum[0] = num[0];
		for(int i = 1; i < n; i++)
			if(sum[i-1] > num[i]) sum[i] = sum[i-1] + num[i];
			else sum[i] = Math.max(num[i], num[i]+sum[i-1]);
		Arrays.sort(sum);
		System.out.print(sum[sum.length-1]);
		scan.close();
	}

}
