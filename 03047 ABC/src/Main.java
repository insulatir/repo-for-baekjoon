import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] ABC = new int[3];
		for (int i = 0; i < 3; i++) {
			ABC[i] = scan.nextInt();
		}

		Arrays.sort(ABC);
		
		int A = ABC[0];
		int B = ABC[1];
		int C = ABC[2];
		
		String s = scan.next();
		for (int i = 0; i < 3; i++) {
			char ch = s.charAt(i);
			
			if (ch == 'A') {
				System.out.print(A + " ");
			} else if (ch == 'B') {
				System.out.print(B + " ");
			} else {
				System.out.print(C + " ");
			}
		}
		
		scan.close();
	}

}
