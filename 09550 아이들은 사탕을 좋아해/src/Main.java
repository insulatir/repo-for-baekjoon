import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int result = 0;
			
			for(int j = 0; j < n; j++)
				result += scan.nextInt()/k;
			
			System.out.println(result);
		}
		
		scan.close();
	}

}
