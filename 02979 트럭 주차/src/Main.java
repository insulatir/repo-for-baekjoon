import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int[] truck = new int[100];
		for (int i = 0; i < 3; i++) {
			int d = scan.nextInt();
			int l = scan.nextInt();
			
			for (int j = d; j < l; j++) {
				truck[j] += 1;
			}
		}
		
		int fee = 0;
		for (int i = 0; i < 100; i++) {
			switch (truck[i]) {
			case 1:
				fee += A;
				break;
			case 2:
				fee += B + B;
				break;
			case 3:
				fee += C + C + C;
				break;
			}
		}
		
		System.out.print(fee);
		
		scan.close();
	}

}
