import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numPoints = scanner.nextInt();
		long[] x = new long[numPoints];
		long[] y = new long[numPoints];
		double area = 0;
		
		for(int i = 0; i < numPoints; i++) {
			x[i] = scanner.nextLong();
			y[i] = scanner.nextLong();
		}
		
		int j = numPoints - 1;
		for (int i = 0; i < numPoints; i++) {
            area += (x[j] + x[i]) * (y[j] - y[i]);
            j = i;
        }
		
		area = Math.abs(area) / 2.0;
		System.out.print(String.format("%.1f", area));
		
		scanner.close();
	}

}
