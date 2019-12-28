import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(reverse(reverse(A) + reverse(B)));
		}
		
		scan.close();
	}

	public static int reverse(int n) {
		String num = n + "";
		String res = "";
		
		for (int i = 0; i < num.length(); i++) {
			res = res.concat(num.charAt(num.length()- 1 - i) + "");
		}
		
		int index = 0;
		while (res.charAt(index) == '0') {
			index += 1;
		}
		
		res.substring(index);
		return Integer.parseInt(res);
	}
}
