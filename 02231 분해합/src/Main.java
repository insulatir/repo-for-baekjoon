import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		boolean exist = false;
		for (int i = 1; i < N; i++) {
			String is = new String(i + "");
			int compare = i;
			for (int j = 0; j < is.length(); j++) {
				compare += Integer.parseInt(is.charAt(j) + "");
			}
			
			if (N == compare) {
				System.out.println(i);
				exist = true;
				break;
			}
		}
		
		if (!exist) {
			System.out.println(0);
		}
		
		scan.close();
	}

}
