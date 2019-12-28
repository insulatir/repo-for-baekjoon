import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int T = scan.nextInt();
		int C = scan.nextInt();
		int P = scan.nextInt();
		
		System.out.print(((N-1)/T)*C*P);
		
		scan.close();
	}

}
