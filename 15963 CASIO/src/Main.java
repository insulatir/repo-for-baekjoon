import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long M = scan.nextLong();
		
		System.out.print(N==M?1:0);
		
		scan.close();
	}

}
