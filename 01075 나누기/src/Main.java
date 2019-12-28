import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int F = scan.nextInt();
		int N100 = (N / 100) * 100;
		int remain = N100 % F;
		int result = (F - remain) % F;
		if (result < 10) {
			System.out.println("0" + result);
		} else {
			System.out.println(result);
		}
		
		scan.close();
	}

}
