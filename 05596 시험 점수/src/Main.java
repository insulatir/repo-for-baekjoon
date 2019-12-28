import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int S = scan.nextInt();
		S += scan.nextInt();
		S += scan.nextInt();
		S += scan.nextInt();
		int T = scan.nextInt();
		T += scan.nextInt();
		T += scan.nextInt();
		T += scan.nextInt();
		
		System.out.println(Math.max(S, T));
		
		scan.close();
	}

}
