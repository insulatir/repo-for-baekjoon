import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if (N > 10) {
			double Nd = N / 10.0;
			N = (int) Math.round(Nd) * 10;
		} 
		
		if (N > 100) {
			double Nd = N / 100.0;
			N = (int) Math.round(Nd) * 100;
		} 
		
		if (N > 1000) {
			double Nd = N / 1000.0;
			N = (int) Math.round(Nd) * 1000;
		} 
		
		if (N > 10000) {
			double Nd = N / 10000.0;
			N = (int) Math.round(Nd) * 10000;
		} 
		
		if (N > 100000) {
			double Nd = N / 100000.0;
			N = (int) Math.round(Nd) * 100000;
		} 
		
		if (N > 1000000) {
			double Nd = N / 1000000.0;
			N = (int) Math.round(Nd) * 1000000;
		} 
		
		if (N > 10000000) {
			double Nd = N / 10000000.0;
			N = (int) Math.round(Nd) * 10000000;
		} 
		
		if (N > 100000000) {
			double Nd = N / 100000000.0;
			N = (int) Math.round(Nd) * 100000000;
		}
		
		System.out.println(N);
		
		scan.close();
	}

}
