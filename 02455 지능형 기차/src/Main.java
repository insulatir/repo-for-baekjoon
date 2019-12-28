import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = (-1) * (scan.nextInt() - scan.nextInt());
		int b = (-1) * (scan.nextInt() - scan.nextInt());
		int c = (-1) * (scan.nextInt() - scan.nextInt());
		int d = (-1) * (scan.nextInt() - scan.nextInt());
		int[] people = new int[4];
		people[0] = a;
		people[1] = a + b;
		people[2] = a + b + c;
		people[3] = a + b + c + d;
		
		Arrays.sort(people);
		
		System.out.println(people[3]);
 		
		scan.close();
	}

}
