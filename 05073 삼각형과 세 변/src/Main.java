import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] len = new int[3];
		len[0] = scan.nextInt();
		len[1] = scan.nextInt();
		len[2] = scan.nextInt();
		while (!(len[0]+len[1]+len[2]==0)) {
			Arrays.sort(len);
			if (len[2] < len[0] + len[1]) {
				if (len[0] == len[1] && len[1] == len[2]) {
					System.out.println("Equilateral");
				} else if (len[0] == len[1] || len[1] == len[2] || len[0] == len[2]) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			} else {
				System.out.println("Invalid");
			}
			
			len[0] = scan.nextInt();
			len[1] = scan.nextInt();
			len[2] = scan.nextInt();
		}
		
		scan.close();
	}

}
