import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int F = scan.nextInt();
		while (!(M == 0 && F == 0)) {
			System.out.println(M+F);
			M = scan.nextInt();
			F = scan.nextInt();
		}
		
		scan.close();
	}

}
