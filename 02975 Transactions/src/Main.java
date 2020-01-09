import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance = scan.nextInt();
		String letter = scan.next();
		int amount = scan.nextInt();
		while (!(balance == 0 && letter.equals("W") && amount == 0)) {
			balance += letter.equals("D") ? amount : -amount;
			System.out.println(balance >= -200 ? balance : "Not allowed");
			
			balance = scan.nextInt();
			letter = scan.next();
			amount = scan.nextInt();
		}
		
		scan.close();
	}

}
