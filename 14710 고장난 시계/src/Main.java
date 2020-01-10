import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double theta1 = scan.nextDouble();
		double theta2 = scan.nextDouble();
		
		theta1 -= theta2 / 12;
		
		System.out.print(theta1%30==0?"O":"X");
		
		scan.close();
	}

}
