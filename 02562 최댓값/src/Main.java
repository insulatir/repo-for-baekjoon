import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int maxi = 0;
		int[] array = new int[9];
		for(int i = 0; i < 9; i++)
			array[i] = scan.nextInt();
		for(int i = 0; i < 9; i++)
			if(max < array[i]) {
				max = array[i];
				maxi = i+1;		
			}
		System.out.print(max + "\n" + maxi);
		scan.close();
	}

}
