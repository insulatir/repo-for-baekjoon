import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < N+i; j++) {
				if (j == N-1-i) {
					System.out.print("*");
				} else if (j == N-1+i){
					System.out.print("* ");
					break;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 2*N-1; i++) {
			System.out.print("*");
		}
		
		scan.close();
	}

}
