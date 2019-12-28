import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int div = 0;
		for (int i = 2; i <= (int) Math.sqrt(N); i++) {
			if (N % i == 0) {
				div = i;
				break;
			}
		}
		
		if (div == 0) {
			div = N;
		}
		
		System.out.println(N - N / div);
		
		scan.close();
	}

}
