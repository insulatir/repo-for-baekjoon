import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		while (!(N==0)) {
			System.out.println(N*(N+1)*(2*N+1)/6);
			N = scan.nextInt();
		}
		
		scan.close();
	}

}
