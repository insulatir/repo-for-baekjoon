import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int result = 2;
		for (int i = 0; i < N; i++) {
			result = result * 2 - 1;
		}
		
		System.out.println(result * result);
		
		scan.close();
	}

}
