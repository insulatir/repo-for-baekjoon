import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		scan.next();
		int b = scan.nextInt();
		scan.next();
		int c = scan.nextInt();
		
		System.out.print(a+b==c?"YES":"NO");
		
		scan.close();
	}

}
