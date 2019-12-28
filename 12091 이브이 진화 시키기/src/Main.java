import java.util.*;
public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		switch (random.nextInt(3)) {
		case 0:
			System.out.println("Vaporeon");
			break;
		case 1:
			System.out.println("Jolteon");
			break;
		case 2:
			System.out.println("Flareon");
			break;
		}
	}

}
