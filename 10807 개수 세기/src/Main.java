import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] many = new int[201];
		for (int i = 0; i < N; i++) {
			many[scan.nextInt() + 100] += 1;
		}
		
		System.out.print(many[scan.nextInt() + 100]);
		
		scan.close();
	}

}
