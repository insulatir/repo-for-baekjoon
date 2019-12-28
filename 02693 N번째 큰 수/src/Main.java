import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			int[] array = new int[10];
			for(int j = 0; j < 10; j++)
				array[j] = scan.nextInt();
			Arrays.sort(array);
			System.out.println(array[array.length-3]);
		}
		scan.close();
	}

}
