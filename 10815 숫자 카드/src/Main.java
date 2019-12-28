import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		String[] array = br.readLine().split(" ");
		for(int i = 0; i < N; i++)
			a[i] = Integer.parseInt(array[i]);
		Arrays.sort(a);
		int M = Integer.parseInt(br.readLine());
		for(int i = 0; i < M; i++)
			bw.write((find(Integer.parseInt(br.readLine().split(" ")[i]), a)) + " ");
		bw.flush();
		bw.close();
	}
	
	private static int find(int n, int[] num) {
		int left, mid, right;
		left = 0;
		right = num.length-1;
		mid = 0;
		for(; left <= right; ) {
			mid = (left+right)/2;
			if(n < num[mid]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		if(n == num[right]) return 1;
		else return 0;
	}
}
