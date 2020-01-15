import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = scan.nextInt();
		while (sum > 0) {
			int max = 0;
			for (int n2 = 0; (n2 * (n2 + 1) * (n2 + 2)) / 6 
					<= sum; n2++) {
				int n1 = 0;
				while (n1 * n1 * n1 <= sum - (n2 * (n2 + 1) * (n2 + 2)) / 6) {
					n1 += 1;
				}
				n1 -= 1;
				if (max < (n2 * (n2 + 1) * (n2 + 2)) / 6 + n1 * n1 * n1) {
					max = (n2 * (n2 + 1) * (n2 + 2)) / 6 + n1 * n1 * n1;
				}
			}
			
			System.out.println(max);
			
			sum = scan.nextInt();
		}
		
		scan.close();
	}

}
