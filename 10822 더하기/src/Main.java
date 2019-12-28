import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		String[] nums = S.split(",");
		int res = 0;
		for (String item : nums) {
			res += Integer.parseInt(item);
		}
		
		System.out.println(res);
		
		scan.close();
	}

}
