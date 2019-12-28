import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int burger = Math.min(Math.min(A, B), Math.min(B, C));
		int drink = Math.min(a, b);
		
		System.out.println(burger + drink - 50);
		
		scan.close();
	}

}
