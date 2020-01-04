import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[4];
		int[] y = new int[4];
		
		for (int i = 0; i < 4; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
			
		int len = Math.max(x[3]-x[0], y[3]-y[0]);
		
		System.out.print(len*len);
		
		scan.close();
	}

}
