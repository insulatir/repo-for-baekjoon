import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int[] xj = new int[1000001];
		xj[0] = 1;
		
		for(int j = 1; j < xj.length; j++) {
			xj[j] = (xj[(int)(j - Math.sqrt(j))] + xj[(int)Math.log(j)] 
					+ xj[(int)(j*(Math.sin(j)*Math.sin(j)))]) % 1000000;
		}
		
		for(; i > -1; ) {
			System.out.println(xj[i]);
			i = scan.nextInt();
		}
		
		scan.close();
	}

}
