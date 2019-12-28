import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numPoints = scanner.nextInt();
		int[] x = new int[numPoints];
		int[] y = new int[numPoints];
		double area = 0;
		int j = numPoints - 1;
		
		for(int i = 0; i < numPoints; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		
		for(int k = 0; k < numPoints; k++) {
			area += (x[j] + x[k]) * (y[j] - y[k]);
			j = k;
		}
		
		area = area / 2.0;
		System.out.print(Math.abs(Math.round(area * 10) / 10.0));
		
		scanner.close();
	}

}
