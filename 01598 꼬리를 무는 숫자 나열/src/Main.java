import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int ax = (a - 1) / 4 + 1;
		int ay = (a - 1) % 4 + 1;
		
		int bx = (b - 1) / 4 + 1;
		int by = (b - 1) % 4 + 1;
		
		System.out.print(Math.abs(bx - ax) + Math.abs(by - ay));
		
		scan.close();
	}

}
