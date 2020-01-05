import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		
		int a = ((N-1)/A+1)*B;
		int c = ((N-1)/C+1)*D;
		
		System.out.print(Math.min(a, c));
		
		scan.close();
	}

}
