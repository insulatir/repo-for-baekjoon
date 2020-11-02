import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			String num = scan.next();
			String rev = "";
			for (int j = 0; j < num.length(); j++) {
				rev += num.charAt(num.length()-j-1);
			}
			
			int num1 = Integer.parseInt(num);
			int rev1 = Integer.parseInt(rev);
			int sum1 = num1 + rev1;
			String sum = sum1 + "";
			
			boolean sol = true;
			for (int j = 0; j < sum.length()/2; j++) {
				if (sum.charAt(j) != sum.charAt(sum.length()-j-1)) {
					sol = false;
					break;
				}
			}
			
			System.out.println(sol ? "YES" : "NO");
		}
		
		scan.close();
	}

}
