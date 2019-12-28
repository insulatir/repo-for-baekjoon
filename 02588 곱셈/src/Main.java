import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a * (b % 10));
		System.out.println(a * ((b / 10) % 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
		
		scan.close();
	}

}
