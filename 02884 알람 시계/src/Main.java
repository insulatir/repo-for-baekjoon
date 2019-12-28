import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		int min = H * 60 + M;
		int alarm = min - 45;
		if (alarm < 0) {
			alarm += 24 * 60;
		}
		System.out.print(alarm / 60 + " " + alarm % 60);
		
		scan.close();
	}

}
