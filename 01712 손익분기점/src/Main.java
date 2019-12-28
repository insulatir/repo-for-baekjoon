import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if (C - B == 0) {
			System.out.println(-1);
		} else {
			int res = A / (C - B) + 1;
			System.out.println(res <= 0 ? "-1" : res);
			
		}
		
		scan.close();
	}

}
