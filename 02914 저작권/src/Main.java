import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int l = scan.nextInt();
		System.out.println(A * (l - 1) + 1);
		
		scan.close();
	}

}
