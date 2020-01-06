import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		for (int i = 0; i < N; i++) {
			int student = scan.nextInt();
			int apple = scan.nextInt();
			res += apple % student;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
