import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[] m = new int[13];
		int d = 0;
		m[0] = 0;
		m[1] = m[3] = m[5] = m[7] = m[8] = m[10] = m[12] = 31;
		m[4] = m[6] = m[9] = m[11] = 30;
		m[2] = 28;
		for(int i = 0; i < x; i++)
			d += m[i];
		d += y;
		int w = d % 7;
		switch(w) {
		case 0:
			System.out.print("SUN");
			break;
		case 1:
			System.out.print("MON");
			break;
		case 2:
			System.out.print("TUE");
			break;
		case 3:
			System.out.print("WED");
			break;
		case 4:
			System.out.print("THU");
			break;
		case 5:
			System.out.print("FRI");
			break;
		case 6:
			System.out.print("SAT");
			break;
		}
		scanner.close();
	}

}
