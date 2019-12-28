
public class Main {

	public static void main(String[] args) {
		
		double[] e = new double[10];
		
		System.out.println("n e ");
		System.out.println("- -----------");
		
		for(int i = 0; i < 10; i++) {
			if(i == 0) 
				e[i] = 1;
			else
				e[i] = e[i-1] + 1.0 / fact(i);
			
			if(i == 0 || i == 1)
				System.out.println(i + " " + (int) e[i]);
			else if(i == 2)
				System.out.printf("%d %.1f \n", i, e[i]);
			else
				System.out.printf("%d %.9f \n", i, e[i]);
		}
		
	}
	
	static double fact(double n) {
		if(n == 0.0) 
			return 1.0;
		
		return n * fact(n-1.0);
	}
}
