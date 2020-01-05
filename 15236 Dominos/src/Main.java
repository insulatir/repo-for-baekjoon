import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		System.out.print(N*(N+1)*(N+2)/2);
		
		scan.close();
	}

}
