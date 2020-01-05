import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.print(A==B?A:A<B?B:A);
		
		scan.close();
	}

}
