import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sumOftem = scan.nextInt();
		int sumOfnine = 0;
		for (int i = 0; i < 9; i++) {
			sumOfnine += scan.nextInt();
		}

		System.out.println(sumOftem - sumOfnine);
		
		scan.close();
	}

}
