import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int O = scan.nextInt();
		int flag = O % (N - 1);
		if (flag == 0) {
			System.out.print(O / (N - 1) - 1 + O + " " + (O / (N - 1) + O));
		} else {
			System.out.print(O / (N - 1) + O + " " + (O / (N - 1) + O));
		}
		
		scan.close();
	}

}
