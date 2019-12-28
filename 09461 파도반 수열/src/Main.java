import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long[] wave = new long[101];
		wave[1] = 1;
		wave[2] = 1;
		wave[3] = 1;
		wave[4] = 2;
		wave[5] = 2;
		for (int i = 6; i < 101; i++) {
			wave[i] = wave[i-1] + wave[i-5];
		}
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			
			System.out.println(wave[N]);
		}
		
		scan.close();
	}

}
