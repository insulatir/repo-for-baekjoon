import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int len = scan.nextInt();
		int[] lens = new int[M];
		for(int i = 0; i < M; i++) {
			lens[i] = scan.nextInt();
		}
		
		scan.close();
	}

}
