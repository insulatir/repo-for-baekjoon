import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] one = new int[M];
		int[] six = new int[M];
		for (int i = 0; i < M; i++) {
			six[i] = scan.nextInt();
			one[i] = scan.nextInt();
		}

		Arrays.sort(six);
		Arrays.sort(one);
		
		int before = (N / 6) * 6;
		int after = N % 6;
		
		int beforeSix = (before / 6) * six[0];
		int beforeOne = before * one[0];
		
		int afterSix = six[0];
		int afterOne = after * one[0];
		
		int beforeMin = Math.min(beforeSix, beforeOne);
		int afterMin = Math.min(afterSix, afterOne);
		
		System.out.println(beforeMin + afterMin);
		
		scan.close();
	}

}
