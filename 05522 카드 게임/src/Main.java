import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		sum += scan.nextInt();
		sum += scan.nextInt();
		sum += scan.nextInt();
		sum += scan.nextInt();
		sum += scan.nextInt();
		
		System.out.print(sum);
		
		scan.close();
	}

}
