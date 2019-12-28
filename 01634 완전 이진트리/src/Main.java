import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		Queue<int[]> q = new LinkedList<int[]>();
		int[] t1 = new int[(int)Math.pow(2, k-1)];
		int[] t2 = new int[(int)Math.pow(2, k-1)];
		int[] t1a = new int[(int)Math.pow(2, k-1)];
		int[] t2a = new int[(int)Math.pow(2, k-1)];
		int[] t1b = new int[(int)Math.pow(2, k-1)-1];
		int[] t2b = new int[(int)Math.pow(2, k-1)-1];
		for(int i = 0; i < t1.length; i++)
			t1[i] = scan.nextInt();
		for(int i = 0; i < t2.length; i++)
			t2[i] = scan.nextInt();
		for(int i = 0; i < t1.length; i++) {
			t1a[t1[i]-1] = i/2;
			t2a[t2[i]-1] = i/2;
		}
		for(int i = 0; i < t1.length-1; i++)
			t1b[i] = t1a[i] - t1a[i+1];
		for(int i = 0; i < t2.length-1; i++)
			t2b[i] = t2a[i] - t2a[i+1];
		for(int i = 0; i < (int)Math.pow(2, k-1)-1; i++) {
			int t1v = 0;
			int t2v = 0;
			for(int j = i; j < (int)Math.pow(2, k-1)-1; j++) {
				t1v += t1b[j];
				t2v += t2b[j];
				if(Math.abs(t1v) == Math.abs(t2v)) {
					int[] temp = new int[2];
					temp[0] = i+1;
					temp[1] = j+2;
					q.add(temp);
				}
			}
		}
		while(!q.isEmpty()) {
			int[] temp = q.remove();
			System.out.println(temp[0] + " " + temp[1]);
		}
	}

}
