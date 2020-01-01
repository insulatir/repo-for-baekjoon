import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int S = scan.nextInt();
		int T = scan.nextInt();
		int D = scan.nextInt();
		
		System.out.print(T*D/(2*S));
		
		scan.close();
	}

}
