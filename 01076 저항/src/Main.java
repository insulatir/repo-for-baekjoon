import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String first = scan.next();
		String second = scan.next();
		String third = scan.next();
		
		long one = value(first);
		long two = value(second);
		long three = value(third);
		
		
		System.out.println((10 * one + two) * (long) Math.pow(10, three));
		
		scan.close();
	}

	public static long value(String color) {
		switch (color) {
		case "black":
			return 0;
		case "brown":
			return 1;
		case "red":
			return 2;
		case "orange":
			return 3;
		case "yellow":
			return 4;
		case "green":
			return 5;
		case "blue":
			return 6;
		case "violet":
			return 7;
		case "grey":
			return 8;
		case "white":
			return 9;
		default:
			return -1;
		}
	}
}
