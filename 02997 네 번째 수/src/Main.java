import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		num[2] = scan.nextInt();
		
		Arrays.sort(num);
		
		if (num[1] - num[0] == num[2] - num[1]) {
			System.out.println(2 * num[2] - num[1]);
		} else {
			if (num[1] - num[0] == 2 * (num[2] - num[1])) {
				System.out.println((num[1] + num[0]) / 2);
			} else {
				System.out.println((num[2] + num[1]) / 2);
			}
		}
		
		scan.close();
	}

}
