import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] w = new int[10];
		int[] k = new int[10];
		for (int i = 0; i < 10; i++) {
			w[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			k[i] = scan.nextInt();
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		
		System.out.println((w[7] + w[8] + w[9]) + " " + (k[7] + k[8] + k[9]));
		
		scan.close();
	}

}
