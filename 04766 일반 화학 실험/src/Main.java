import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double t1 = scan.nextDouble();
		double t2 = scan.nextDouble();
		while (!(t2 == 999)) {
			System.out.println(String.format("%.2f", t2-t1));	
			t1 = t2;
			t2 = scan.nextDouble();
		}
		
		scan.close();
	}

}
