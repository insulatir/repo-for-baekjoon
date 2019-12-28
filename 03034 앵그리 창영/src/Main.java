import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int W = scan.nextInt();
		int H = scan.nextInt();
		int max = (int) Math.sqrt(W * W + H * H);
		for (int i = 0; i < N; i++) {
			int len = scan.nextInt();
			System.out.println(max >= len ? "DA" : "NE");
		}
		
		scan.close();
	}

}
