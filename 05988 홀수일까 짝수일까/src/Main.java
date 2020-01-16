import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			String K = scan.next();
			String last = K.substring(K.length()-1, K.length());
			int flag = Integer.parseInt(last);
			System.out.println(flag % 2 == 0 ? "even" : "odd");
		}
		
		scan.close();
	}

}
