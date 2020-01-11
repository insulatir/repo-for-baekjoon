import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		for (int i = 1; i <= N; i++) {
			String si = i + "";
			int divide = 0;
			for (int j = 0; j < si.length(); j++) {
				int ith = Integer.parseInt(si.subSequence(j, j+1).toString());
				divide += ith;
			}
			if (i % divide == 0) {
				res += 1;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
