import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] four = new int[4];
		int[] two = new int[2];
		
		four[0] = scan.nextInt();
		four[1] = scan.nextInt();
		four[2] = scan.nextInt();
		four[3] = scan.nextInt();
		
		two[0] = scan.nextInt();
		two[1] = scan.nextInt();
		
		Arrays.sort(four);
		Arrays.sort(two);
		
		System.out.print(four[1] + four[2] + four[3] + two[1]);
		
		scan.close();
	}

}
