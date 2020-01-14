import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.print("Case " + i + ": ");
			
			int N = scan.nextInt();
			double[] x = new double[N];
			double[] y = new double[N];
			for (int j = 0; j < N; j++) {
				x[j] = scan.nextDouble();
				y[j] = scan.nextDouble();
			}
			Arrays.sort(x);
			Arrays.sort(y);
			
			double hor = x[N-1] - x[0];
			double ver = y[N-1] - y[0];
			System.out.println("Area " + hor * ver + ", Perimeter " + 2.0 * (hor + ver));
		}
		
		scan.close();
	}

}
