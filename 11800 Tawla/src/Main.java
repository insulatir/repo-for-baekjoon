import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] alias = new String[7];
		alias[1] = "Yakk";
		alias[2] = "Doh";
		alias[3] = "Seh";
		alias[4] = "Ghar";
		alias[5] = "Bang";
		alias[6] = "Sheesh";
		String[][] state = new String[7][7];
		state[1][1] = "Habb Yakk";
		state[2][2] = "Dobara";
		state[3][3] = "Dousa";
		state[4][4] = "Dorgy";
		state[5][5] = "Dabash";
		state[6][6] = "Dosh";
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i < j) {
					state[i][j] = alias[j] + " " + alias[i];
				} else if (i > j) {
					state[i][j] = alias[i] + " " + alias[j];
				} 
				if ((i == 6 && j == 5) || (i == 5 && j == 6)) {
					state[i][j] = "Sheesh Beesh";
				}
			}
		}
		
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			System.out.print("Case " + i + ": ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(state[a][b]);
		}
		
		scan.close();
	}

}
