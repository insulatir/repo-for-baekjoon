import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double ab = scan.nextDouble();
		double bc = scan.nextDouble();
		double cd = scan.nextDouble();
		
		System.out.println(ab * cd / bc);
		
		scan.close();
	}

}
