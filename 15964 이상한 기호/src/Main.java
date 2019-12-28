import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long B = scan.nextLong();
		
		System.out.print((A+B)*(A-B));
		
		scan.close();
	}

}
