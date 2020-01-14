import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] ranks = new int[14];
		for (int i = 0; i < 5; i++) {
			String card = scan.next();
			switch (card.charAt(0)) {
			case 'A':
				ranks[0] += 1;
				break;
			case '1':
				ranks[1] += 1;
				break;
			case '2':
				ranks[2] += 1;
				break;
			case '3':
				ranks[3] += 1;
				break;
			case '4':
				ranks[4] += 1;
				break;
			case '5':
				ranks[5] += 1;
				break;
			case '6':
				ranks[6] += 1;
				break;
			case '7':
				ranks[7] += 1;
				break;
			case '8':
				ranks[8] += 1;
				break;
			case '9':
				ranks[9] += 1;
				break;
			case 'T':
				ranks[10] += 1;
				break;
			case 'J':
				ranks[11] += 1;
				break;
			case 'Q':
				ranks[12] += 1;
				break;
			case 'K':
				ranks[13] += 1;
				break;
			}
		}
		Arrays.sort(ranks);
		
		System.out.print(ranks[13]);
		
		scan.close();
	}

}
