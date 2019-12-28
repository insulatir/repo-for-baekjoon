import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int[] passenger = new int[31];
		
		for(int i = 1; i < 31; i++)
			passenger[i] = passenger[i-1] + passenger[i-1] + 1;
		
		for(int i = 0; i < t; i++) {
			int k = scan.nextInt();
			
			System.out.println(passenger[k]);
		}
		
		scan.close();
	}

}
