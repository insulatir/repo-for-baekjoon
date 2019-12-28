import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] abc = new int[3];
		abc[0] = scan.nextInt();
		abc[1] = scan.nextInt();
		abc[2] = scan.nextInt();
		
		Arrays.sort(abc);
		
		System.out.println(abc[0] + " " + abc[1] + " " + abc[2]);
		
		scan.close();
	}

}
