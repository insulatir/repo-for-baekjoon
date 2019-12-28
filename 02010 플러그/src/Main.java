import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result = 1;
		
		for(int i = 0; i < n; i++) 
			result += scan.nextInt();
		
		System.out.print(result - n);
		
		scan.close();
	}

}
