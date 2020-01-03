import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a3 = scan.nextInt();
		int a2 = scan.nextInt();
		int a1 = scan.nextInt();
		int b3 = scan.nextInt();
		int b2 = scan.nextInt();
		int b1 = scan.nextInt();
		
		int a = a3*3 + a2*2 + a1;
		int b = b3*3 + b2*2 + b1;
		
		System.out.print(a > b ? "A" : a < b ? "B" : "T");
		
		scan.close();
	}

}
