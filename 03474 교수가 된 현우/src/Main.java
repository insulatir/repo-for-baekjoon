import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0 ; i < t; i++) {
			long n = scan.nextLong();
			long zeros = 0;
			
			zeros = n/5 + n/(5*5) + n/(5*5*5) + n/(5*5*5*5) 
					+ n/(5*5*5*5*5) + n/(5*5*5*5*5*5) 
					+ n/(5*5*5*5*5*5*5) + n/(5*5*5*5*5*5*5*5)
					+ n/(5*5*5*5*5*5*5*5*5) + n/(5*5*5*5*5*5*5*5*5*5)
					+ n/(5*5*5*5*5*5*5*5*5*5*5) + n/(5*5*5*5*5*5*5*5*5*5*5*5);
			
			System.out.println(zeros);
		}
		
		scan.close();
	}

}
