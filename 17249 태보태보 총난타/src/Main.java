import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String TaeBo = scan.next();
		
		String[] LR = TaeBo.split("0");
		
		String L = LR[0];
		String R = LR[1];
		
		int count_of_left = 0;
		int count_of_right = 0;
		
		for (char ch : L.toCharArray()) {
			if (ch == '@') {
				count_of_left += 1;
			}
		}
		
		for (char ch : R.toCharArray()) {
			if (ch == '@') {
				count_of_right += 1;
			}
		}
		
		System.out.print(count_of_left + " " + count_of_right);
		
		scan.close();
	}

}
