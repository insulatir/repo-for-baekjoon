import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int v = scan.nextInt();
			int e = scan.nextInt();
			
			System.out.println(2-v+e);
		}
		
		scan.close();
	}

}
