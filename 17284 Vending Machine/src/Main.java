import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int change = 5000;
		String line = scan.nextLine();
		String[] buttons = line.split(" ");
		for (int i = 0; i < buttons.length; i++) {
			switch (buttons[i]) {
			case "1":
				change -= 500;
				break;
			case "2":
				change -= 800;
				break;
			case "3":
				change -= 1000;
				break;
			}
		}
		
		System.out.print(change);
		
		scan.close();
	}

}
