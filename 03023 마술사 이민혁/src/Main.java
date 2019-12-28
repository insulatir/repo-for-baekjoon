import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();
		int C = scan.nextInt();
		String[][] design = new String[R][C];
		for (int i = 0; i < R; i++) {
			design[i] = scan.next().split("");
		}
		
		int errorY = scan.nextInt()-1;
		int errorX = scan.nextInt()-1;
		
		for (int i = 0; i < 2 * R; i++) {
			for (int j = 0; j < 2 * C; j++) {
				int x, y = 0;
				y = i < R ? i : 2*R-i-1;
				x = j < C ? j : 2*C-j-1;
				
				if (i == errorY && j == errorX) {
					design[y][x] = design[y][x] == "." ? "#" : ".";
				}
				
				System.out.print(design[y][x]);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
