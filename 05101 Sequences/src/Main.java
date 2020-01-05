import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		while (!(a == 0 && b == 0 && c == 0)) {
			System.out.println((c-a)%b==0?1+(c-a)/b:"X");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
		
		scan.close();
	}

}
