import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += (scan.nextInt()+1)/2;
		}
		
		System.out.print(sum<N?"NO":"YES");
		
		scan.close();
	}

}
