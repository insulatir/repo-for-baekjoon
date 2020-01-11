import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double sp = scan.nextDouble();
		double sw = scan.nextDouble();
		double np = scan.nextDouble();
		double nw = scan.nextDouble();
		double up = scan.nextDouble();
		double uw = scan.nextDouble();
		
		if (sp >= 500) {
			sp -= 50;
		}
		if (np >= 500) {
			np -= 50;
		}
		if (up >= 500) {
			up -= 50;
		}
		
		double s = sw / sp;
		double n = nw / np;
		double u = uw / up;
		
		if (s < n) {
			if (n < u) {
				System.out.print("U");
			} else {
				System.out.print("N");
			}
		} else {
			if (s < u) {
				System.out.print("U");
			} else {
				System.out.print("S");
			}
		}
		
		scan.close();
	}

}
