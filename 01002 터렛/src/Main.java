import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			double x1, y1, r1, x2, y2, r2, d, max;
			int maxi;
			double[] len = new double[3];
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			d = Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2), 0.5);
			if(d == 0) {
				if(r1-r2 == 0) System.out.println(-1);
				else System.out.println(0);
				continue;
			}
			max = 0;
			maxi = 0;
			len[0] = r1;
			len[1] = r2;
			len[2] = d;
			for(int j = 0; j < 3; j++)
				if(max < len[j]) {
					max = len[j];
					maxi = j;
				}
			switch(maxi) {
			case(0):
				if(r1 < d+r2) System.out.println(2);
				else if(r1 == d+r2) System.out.println(1);
				else System.out.println(0);
				break;
			case(1):
				if(r2 < d+r1) System.out.println(2);
				else if(r2 == d+r1) System.out.println(1);
				else System.out.println(0);
				break;
			case(2):
				if(d < r1+r2) System.out.println(2);
				else if(d == r1+r2) System.out.println(1);
				else System.out.println(0);
				break;
			}
		}
		scan.close();
	}

}
