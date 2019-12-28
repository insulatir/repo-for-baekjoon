import java.util.*;
public class Main {
	private static int[] len;
	private static int[] edge;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int max = 0;
		int result = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		edge = new int[(int)Math.pow(2, k+1)-2];
		len = new int[(int)Math.pow(2, k)];
		for(int i = 0; i < edge.length; i ++)
			edge[i] = scan.nextInt();
		calLen(-1, k, 0);
		for(int i = 0; i < len.length; i++)
			if(max < len[i]) max = len[i];
		for(int i = len.length-1; i >= 0; i--)
			q.add(max-len[i]);
		for(int i = edge.length-1; i > 1; i -= 2) {
			int a = q.remove();
			int b = q.remove();
			int min = Math.min(a, b);
			q.add(min);
			edge[i] += a-min;
			edge[i-1] += b-min;
		}
		edge[1] += q.remove();
		edge[0] += q.remove();
		for(int i = 0; i < edge.length; i++)
			result += edge[i];
		System.out.print(result);
		scan.close();
	}
	
	private static void calLen(int i, int k, int length) {
		if(i >= edge.length) {
			len[(i-2)/2 - (int)(Math.pow(2, k)-2)] = length;
			return;
		}
		if(i > -1)
			length += edge[i];
		calLen(2*i+2, k, length);
		calLen(2*i+3, k, length);
	}
}
