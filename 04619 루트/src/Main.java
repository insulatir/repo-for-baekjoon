import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double B = scan.nextDouble();
		double N = scan.nextDouble();
		
		while (B > 0) {
			double A = Math.pow(B, 1/N);
			int A1 = (int) A;
			int A2 = A1 + 1;
			
			int c1 = (int) Math.abs(B - Math.pow(A1, N));
			int c2 = (int) Math.abs(B - Math.pow(A2, N));
			
			System.out.println(c1 < c2 ? A1 : A2);
			
			B = scan.nextInt();
			N = scan.nextInt();
		}
		
		scan.close();
	}

}
