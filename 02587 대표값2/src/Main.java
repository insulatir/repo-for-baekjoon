import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			num[i] = scan.nextInt();
			sum += num[i];
		}
		
		Arrays.sort(num);
		
		System.out.println(sum / 5);
		System.out.print(num[2]);
		
		scan.close();
	}

}
