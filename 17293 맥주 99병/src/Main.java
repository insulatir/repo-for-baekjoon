import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int n = N;
		while (N > 2) {
			System.out.println(N + " bottles of beer on the wall, " + N + " bottles of beer.\n" + 
					"Take one down and pass it around, " + (N-1) + " bottles of beer on the wall. \n");
			N -= 1;
		}
		
		if (N == 2) {
			System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n" + 
					"Take one down and pass it around, 1 bottle of beer on the wall. \n");
			N -= 1;
		}
		
		if (N == 1) {
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" + 
					"Take one down and pass it around, no more bottles of beer on the wall. \n");
			N -= 1;
		}
		
		if (N == 0) {
			System.out.print("No more bottles of beer on the wall, no more bottles of beer.\n" + 
					"Go to the store and buy some more, ");
			if (n > 1) {
				System.out.print(n + " bottles of beer on the wall.");
			} else if (n == 1) {
				System.out.print(n + " bottle of beer on the wall.");
			} 
		}
		
		scan.close();
	}

}
