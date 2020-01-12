import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int w = scan.nextInt();
		int a = scan.nextInt();
		while (l != 0 || w != 0 || a != 0) {
			if (l == 0) {
				l = a / w;
			} else if (w == 0) {
				w = a / l;
			} else {
				a = l * w;
			}
			
			System.out.println(l + " " + w + " " + a);
			
			l = scan.nextInt();
			w = scan.nextInt();
			a = scan.nextInt();
		}
		
		scan.close();
	}

}
