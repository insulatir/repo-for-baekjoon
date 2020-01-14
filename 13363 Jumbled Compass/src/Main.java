import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int res = n2 - n1;
		if (res > 180) {
			res = res - 360;
		} else if (res <= - 180) {
			res = res + 360;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
