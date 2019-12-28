import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] slice = new int[8];
		for (int i = 0; i < 8; i++) {
			slice[i] = scan.nextInt();
		}
		
		int[] max = new int[8];
		for (int i = 0; i < 8; i++) {
			max[i] = slice[i%8] + slice[(i+1)%8]
					+ slice[(i+2)%8] + slice[(i+3)%8];
		}
		
		Arrays.sort(max);
		
		System.out.println(max[7]);
		
		scan.close();
	}

}
