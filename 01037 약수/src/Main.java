import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] divisors = new int[num];
		for (int i = 0; i < num; i++) {
			divisors[i] = scan.nextInt();
		}
		
		Arrays.sort(divisors);
		
		if (num % 2 == 0) {
			System.out.println(divisors[num/2] * divisors[num/2-1]);
		} else {
			System.out.println(divisors[num/2] * divisors[num/2]);
		}
		
		scan.close();
	}

}
