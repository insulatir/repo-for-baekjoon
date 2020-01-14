import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		while (year != 0) {
			System.out.print(year + " ");
			if (year % 4 == 0 && year >= 1896) {
				if (year >= 1896 && year <= 2020) {
					if ((year >= 1914 && year <= 1918) ||
							year >= 1939 && year <= 1945) {
						System.out.println("Games cancelled");
					} else {
						System.out.println("Summer Olympics");
					}
				} else {
					System.out.println("No city yet chosen");
				}
			} else {
				System.out.println("No summer games");
			}
			
			year = scan.nextInt();
		}
		
		scan.close();
	}

}
