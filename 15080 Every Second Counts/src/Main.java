import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h1 = scan.nextInt();
		scan.next();
		int m1 = scan.nextInt();
		scan.next();
		int s1 = scan.nextInt();
		int h2 = scan.nextInt();
		scan.next();
		int m2 = scan.nextInt();
		scan.next();
		int s2 = scan.nextInt();
		
		int s = (h2-h1)*3600 + (m2-m1)*60 + s2-s1;
		System.out.print(s>=0?s:s+24*60*60);
		
		scan.close();
	}

}
