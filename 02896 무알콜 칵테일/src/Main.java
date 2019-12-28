import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		
		double a = (double) A / (double) i;
		double b = (double) B / (double) j;
		double c = (double) C / (double) k;
		
		double[] abc = new double[3];
		abc[0] = a;
		abc[1] = b;
		abc[2] = c;
		
		Arrays.sort(abc);
		
		double r = abc[0];
		System.out.println((A - i * r) + " " + (B - j * r) + " " + (C - k * r));
		
		scan.close();
	}

}
