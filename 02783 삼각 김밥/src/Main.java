import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int N = scan.nextInt();
		double[] price = new double[N+1];
		price[0] = (double) 1000 * X / (double) Y;
		for (int i = 1; i <= N; i++) {
			X = scan.nextInt();
			Y = scan.nextInt();
			price[i] = (double) 1000 * X / (double) Y;
		}
		
		Arrays.sort(price);
		System.out.println(price[0]);
		
		scan.close();
	}

}
