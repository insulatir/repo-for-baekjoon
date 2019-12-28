import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] person = new int[N];
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			person[i] = scan.nextInt();
		}
		
		Arrays.sort(person);
		
		for (int i = 0; i < N; i++) {
			result += person[i] * (N - i);
		}
		
		System.out.print(result);
		
		scan.close();
	}

}
