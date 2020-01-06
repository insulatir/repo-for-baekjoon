import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double h = scan.nextDouble();
		double w = scan.nextDouble();
		
		double h1 = h / 3;
		double w1 = w;
		
		double h2 = h / 2;
		double w2 = w / 2;
		
		double h3 = h;
		double w3 = w / 3;
		
		double[] mins = new double[3];
		mins[0] = Math.min(h1, w1);
		mins[1] = Math.min(h2, w2);
		mins[2] = Math.min(h3, w3);
		
		Arrays.sort(mins);
		
		System.out.print(mins[2]);
		
		scan.close();
	}

}
