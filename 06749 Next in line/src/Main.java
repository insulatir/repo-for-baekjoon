import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Y = scan.nextInt();
		int M = scan.nextInt();
		System.out.print(M + (M - Y));
		
		scan.close();
	}

}
