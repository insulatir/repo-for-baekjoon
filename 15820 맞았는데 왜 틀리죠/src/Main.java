import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int S1 = scan.nextInt();
		int S2 = scan.nextInt();
		long test = 0;
		long minyeong = 0;
		boolean sample = true;
		for (int i = 0; i < S1; i++) {
			test = scan.nextLong();
			minyeong = scan.nextLong();
			if (test != minyeong) {
				sample = false;
				break;
			}
		}
		boolean system = true;
		for (int i = 0; i < S2; i++) {
			test = scan.nextLong();
			minyeong = scan.nextLong();
			if (test != minyeong) {
				system = false;
				break;
			}
		}
		
		if (sample&&system) {
			System.out.print("Accepted");
		} else if (!sample) {
			System.out.print("Wrong Answer");
		} else {
			System.out.print("Why Wrong!!!");
		}
		
		scan.close();
	}

}
