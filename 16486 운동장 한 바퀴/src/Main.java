import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		
		System.out.println(2*(d1 + d2 * 3.141592));
		
		scan.close();
	}

}
