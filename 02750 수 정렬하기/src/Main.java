import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		for(int i = 0; i < N; i++) {
			System.out.println(num[i]);
		}
		scan.close();
	}

}
