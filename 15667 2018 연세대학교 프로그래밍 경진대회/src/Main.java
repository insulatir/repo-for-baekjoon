import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		System.out.print((int)(-1+Math.sqrt(4*N-3))/2);
		
		scan.close();
	}

}
