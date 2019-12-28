import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int HP = scan.nextInt();
			int MP = scan.nextInt();
			int attack = scan.nextInt();
			int defend = scan.nextInt();
			HP += scan.nextInt();
			MP += scan.nextInt();
			attack += scan.nextInt();
			defend += scan.nextInt();
			
			if (HP < 1) {
				HP = 1;
			}
			
			if (MP < 1) {
				MP = 1;
			}
			
			if (attack < 0) {
				attack = 0;
			}
			
			int point = HP + 5 * MP + 2 * attack + 2 * defend;
			System.out.println(point);
		}
		
		scan.close();
	}

}
