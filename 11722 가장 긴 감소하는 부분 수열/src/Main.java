import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][2];
		a[0][0] = scan.nextInt();
		a[0][1] = 1;
		for(int i = 1; i < n; i++) {
			boolean max = false;
			int[] length = new int[i];
			a[i][0] = scan.nextInt();
			a[i][1] = 1;
			for(int j = 0; j < i; j++)
				if(a[i][0] <  a[j][0]) {
					length[j] = a[j][1] + a[i][1];
					max = true;
				}
			Arrays.sort(length);
			if(max) a[i][1] = length[length.length-1];
		}
		int max = 0;
		for(int i = 0; i < n; i++)
			if(max < a[i][1]) max = a[i][1];
		System.out.print(max);
		scan.close();
	}

}
