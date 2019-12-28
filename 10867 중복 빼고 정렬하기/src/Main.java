import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] count = new int[2001];
		for (int i = 0; i < N; i++) {
			count[scan.nextInt()+1000] += 1;
		}
		
		for (int i = -1000; i <= 1000; i++) {
			if (count[i+1000] > 0) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}

}
