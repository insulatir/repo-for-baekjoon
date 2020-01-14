import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] price = new double[N];
		for (int i = 0; i < N; i++) {
			price[i] = scan.nextDouble();
		}
		Arrays.sort(price);
		
		System.out.print(String.format("%.2f", price[1]));
		
		scan.close();
	}

}
