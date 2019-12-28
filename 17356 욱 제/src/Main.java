import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		double M = (double) (B - A) / (double) 400; 
		System.out.println((double) 1 / (double) ((double) 1 + Math.pow(10, M)));
		
		scan.close();
	}

}
