import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] ticket = new int[N];
		for (int i = 0; i < N; i++) {
			ticket[i] = scan.nextInt();
		}
		
		Arrays.sort(ticket);
		
		int index = 0;
		for (int i = 1; i <= (int)(Math.pow(2, 31)-1); i++) {
			if (index == N) {
				System.out.println(i);
				break;
			}
			
			if (i == ticket[index]) {
				index += 1;
			} else {
				System.out.println(i);
				break;
			}
		}
		
		scan.close();
	}

}
