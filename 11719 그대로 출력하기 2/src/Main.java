import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String string = scanner.nextLine();
			// ������ \n ��� ��.
			System.out.println(string);
		}
		scanner.close();
	}

}
