import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i = N; i > 0; i--) {
			for(int j = 1; j <= N-i; j++)
				System.out.print(" ");
			for(int k = N-i; k < N; k++)
				System.out.print("*");
			System.out.println();
		}
		scanner.close();
	}

}
