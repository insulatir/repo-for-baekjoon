import java.util.*;
public class Main {

	public static void main(String[] args) {
		sumOfMultiples();
	}
	
	public static void sumOfMultiples() {
		Scanner scanner = new Scanner(System.in);
		
		int boundary = scanner.nextInt();
		boolean[] array = new boolean[boundary + 1];
		int n = scanner.nextInt();
		
		while(n != 0) {
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				int element = scanner.nextInt();
				int multiple = boundary / element;
				for(int j = 1; j <= multiple; j++) {
					array[element * j] = true;
				}
			}
			
			for(int i = 0; i < array.length; i++) {
				if(array[i]) {
					sum += i;
					array[i] = false;
				}
			}
			
			System.out.println(sum);
			
			n = scanner.nextInt();
		}
		
		scanner.close();
	}
	
}
