import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			System.out.print("Case #" + i + ": ");
			
			int[] list = new int[5];
			list[0] = scan.nextInt();
			list[1] = scan.nextInt();
			list[2] = scan.nextInt();
			list[3] = scan.nextInt();
			list[4] = scan.nextInt();
			Arrays.sort(list);
			
			System.out.println(list[4]);
		}
		
		scan.close();
	}

}
