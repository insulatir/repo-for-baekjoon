import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		int height = 0;
		int sum = 0;
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '(') {
				if(string.charAt(i+1) == '(') {
					height++;
				}
				else {
					sum += height;
					i++;
				}
			}
			else {
				height--;
				sum++;
			}
		}
		System.out.print(sum);
		scan.close();
	}
	
}
