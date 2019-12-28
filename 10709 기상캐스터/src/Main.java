import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		for (int i = 0; i < H; i++) {
			String line = scan.next();
			int check = -1;
			for (int j = 0; j < W; j++) {
				char cloud = line.charAt(j);
				if (cloud == 'c') {
					check = 0;
				} else {
					if (check != -1) {
						check += 1;
					}
				}
				
				System.out.print(check + " ");
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}
