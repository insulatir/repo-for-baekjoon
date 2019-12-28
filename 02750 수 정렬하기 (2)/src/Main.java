import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] count = new int[2001];
		for (int i = 0; i < N; i++) {
			count[scan.nextInt() + 1000] += 1;
		}
		
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				System.out.println(i-1000);
			}
		}
				
		scan.close();
	}

}
