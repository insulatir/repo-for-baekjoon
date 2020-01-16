import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		int[] many = new int[100];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
			sum += num[i];
			many[num[i] / 10] += 1;
		}
		
		int max = 0;
		int maxi = 0;
		for (int i = 0; i < 100; i++) {
			if (max < many[i]) {
				max = many[i];
				maxi = i;
			}
		}
		
		System.out.println(sum / 10);
		System.out.print(maxi * 10);
		
		scan.close();
	}

}
