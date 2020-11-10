import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		if (N % 2 == 0) {
			System.out.print((N/2+1)*(N/2+1));
		} else {
			System.out.print((N/2+1)*(N/2+2));
		}
		
		scan.close();
	}

}
