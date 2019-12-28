import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		System.out.println((a+b+c+d)/60);
		System.out.println((a+b+c+d)%60);
		
		scan.close();
	}

}
