import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String a = scanner.next();
		int[] n = new int[N];
		int result = 0;
		for(int i = 0; i < N; i++) {
			n[i] = a.charAt(i) - 48;
		}
		for(int j = 0; j < N; j++)
			result += n[j];
		System.out.print(result);
		scanner.close();
	}

}
