import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		int result = 0;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			result = 1;
		}
		
		System.out.print(result);
		
		scan.close();
	}

}
