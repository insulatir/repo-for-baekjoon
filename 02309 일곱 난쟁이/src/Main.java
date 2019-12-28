import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] lens = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			lens[i] = scan.nextInt();
			sum += lens[i];
		}

		boolean check = false;
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				int a = lens[i];
				int b = lens[j];
				
				if (sum - 100 == a + b && !check) {
					lens[i] = 0;
					lens[j] = 0;
					check = true;
				}
			}
		}
		
		Arrays.sort(lens);
		
		for (int i = 2; i < 9; i++) {
			System.out.println(lens[i]);
		}
		
		scan.close();
	}

}
