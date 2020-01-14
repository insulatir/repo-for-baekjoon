import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		int N = scan.nextInt();
		for (int i = 1; i < N; i++) {
			System.out.println(i);
			K -= i;
		}
		
		System.out.print(K);
		
		scan.close();
	}

}
