import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] line = scan.nextLine().split(" ");
		
		int res = 0;
		for (int i = 0; i < line.length; i++) {
			if (Integer.parseInt(line[i]) > 0) {
				res += 1;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
