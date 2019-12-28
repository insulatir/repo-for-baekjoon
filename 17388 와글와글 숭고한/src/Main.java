import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int S = scan.nextInt();
		int K = scan.nextInt();
		int H = scan.nextInt();
		
		int check = S + K + H;
		
		if (check >= 100) {
			System.out.println("OK");
		} else {
			int[] invite = new int[3];
			invite[0] = S;
			invite[1] = K;
			invite[2] = H;
			Arrays.sort(invite);
			
			if (invite[0] == S) {
				System.out.println("Soongsil");
			} else if (invite[0] == K) {
				System.out.println("Korea");
			} else {
				System.out.println("Hanyang");
			}
		}
		
		scan.close();
	}

}
