import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int a = -A + (int)Math.sqrt(A*A-B);
		int b = -A - (int)Math.sqrt(A*A-B);
		
		System.out.print(a==b?a:a<b?a + " " + b:b + " " + a);
		
		scan.close();
	}

}
