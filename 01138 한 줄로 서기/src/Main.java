import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] res = new int[N+1];
		int person = 0;
		for (int i = 1; i <= N; i++) {
			person = scan.nextInt();
			for (int j = 1; j <= N+1; j++) {
				if (person == -1) {
					res[j-1] = i;
					break;
				} else {
					if (res[j] == 0) {
						person -= 1;
					}
				}
			}
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.print(res[i] + " ");
		}
		
		scan.close();
	}

}
