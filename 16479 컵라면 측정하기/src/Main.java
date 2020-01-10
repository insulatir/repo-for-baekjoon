import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(Math.pow(scan.nextDouble(), 2)-Math.pow((scan.nextDouble()-scan.nextDouble()), 2)/4);
		
		scan.close();
	}

}
