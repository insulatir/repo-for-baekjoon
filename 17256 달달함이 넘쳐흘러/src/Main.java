import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ax = scan.nextInt();
		int ay = scan.nextInt();
		int az = scan.nextInt();
		int cx = scan.nextInt();
		int cy = scan.nextInt();
		int cz = scan.nextInt();
		
		int bx = az < cx ? cx - az : az - cx;
		int by = ay < cy ? cy / ay : ay / cy;
		int bz = ax < cz ? cz - ax : ax - cz;
		
		System.out.print(bx + " " + by + " " + bz);
		
		scan.close();
	}

}
