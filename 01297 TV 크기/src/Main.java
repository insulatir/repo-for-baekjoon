import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long d = scan.nextLong();
		long h = scan.nextLong();
		long w = scan.nextLong();
		long rh, rw;
		rh = (long)Math.pow((d*d*h*h)/(h*h+w*w), 0.5);
		rw = (long)Math.pow((d*d*w*w)/(h*h+w*w), 0.5);
		System.out.print(rh + " " + rw);
		scan.close();
	}

}
