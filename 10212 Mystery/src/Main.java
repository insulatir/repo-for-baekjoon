import java.util.*;
public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		if (random.nextInt(2) == 0) {
			System.out.println("Yonsei");
		} else {
			System.out.println("Korea");
		}
	}

}
