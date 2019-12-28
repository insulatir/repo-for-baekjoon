import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] ABCD = new int[4];
		for (int i = 0; i < 4; i++) {
			ABCD[i] = scan.nextInt();
		}
		
		Arrays.sort(ABCD);
		
		System.out.println(ABCD[0] * ABCD[2]);
		
		scan.close();
	}

}
