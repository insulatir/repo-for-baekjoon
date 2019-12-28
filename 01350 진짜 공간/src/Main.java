import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] disk = new int[N];
		for (int i = 0; i < N; i++) {
			disk[i] = scan.nextInt();
		}
		int space = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int file = disk[i];
			if (file == 0) {
				continue;
			}
			
			sum += ((file - 1) / space) + 1; 
		}
		
		System.out.println(sum * space);
		
		scan.close();
	}

}
