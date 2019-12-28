import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		int K = scan.nextInt();
		int Kp = (int)Math.pow(10, K);
		if (Kp != 1) {
			if ((C % Kp) / (Kp / 10) < 5) {
				System.out.println(C - C%Kp);
			} else {
				System.out.println(C - C%Kp + Kp);
			}
		} else {
			System.out.println(C);
		}
		
		scan.close();
	}

}
